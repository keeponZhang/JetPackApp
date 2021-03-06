package com.mooc.ppjoke.ui.detail;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mooc.libcommon.utils.PixUtils;
import com.mooc.libcommon.view.EmptyView;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding;
import com.mooc.ppjoke.model.Comment;
import com.mooc.ppjoke.model.Feed;

public abstract class ViewHandler {
    private final FeedDetailViewModel viewModel;
    protected FragmentActivity mActivity;
    protected Feed mFeed;
    protected RecyclerView mRecyclerView;
    protected LayoutFeedDetailBottomInateractionBinding mInateractionBinding;
    protected FeedCommentAdapter listAdapter;
    private CommentDialog commentDialog;

    public ViewHandler(FragmentActivity activity) {

        mActivity = activity;
        viewModel = ViewModelProviders.of(activity).get(FeedDetailViewModel.class);
    }


    @CallSuper
    public void bindInitData(Feed feed) {
        mInateractionBinding.setOwner(mActivity);
        mFeed = feed;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mActivity, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setItemAnimator(null);
        listAdapter = new FeedCommentAdapter(mActivity) {
            @Override
            public void onCurrentListChanged(@Nullable PagedList<Comment> previousList, @Nullable PagedList<Comment> currentList) {
                boolean empty = currentList.size() <= 0;
                Log.e("TAG", "ViewHandler onCurrentListChanged empty:"+empty );
                handleEmpty(!empty);
            }
        };
        mRecyclerView.setAdapter(listAdapter);

        //设置id,里面请求帖子时需要用到
        viewModel.setItemId(mFeed.itemId);
        viewModel.getLiveDataPageList().observe(mActivity, new Observer<PagedList<Comment>>() {
            @Override
            public void onChanged(PagedList<Comment> comments) {
                listAdapter.submitList(comments);
                handleEmpty(comments.size() > 0);
            }
        });
        mInateractionBinding.inputView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCommentDialog();
            }
        });
    }

    private void showCommentDialog() {
        if (commentDialog == null) {
            commentDialog = CommentDialog.newInstance(mFeed.itemId);
        }
        commentDialog.setCommentAddListener(new CommentDialog.commentAddListener() {
            @Override
            public void onAddComment(Comment comment) {
                handleEmpty(true);
                //pageListAdapter 没有add方法
                listAdapter.addAndRefreshList(comment);
            }
        });

        commentDialog.show(mActivity.getSupportFragmentManager(), "comment_dialog");
    }

    private EmptyView mEmptyView;

    public void handleEmpty(boolean hasData) {
        Log.d("TAG", "ViewHandler handleEmpty hasData:"+hasData );
        if (hasData) {
            if (mEmptyView != null) {
                listAdapter.removeHeaderView(mEmptyView);
            }
        } else {
            if (mEmptyView == null) {
                mEmptyView = new EmptyView(mActivity);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.topMargin = PixUtils.dp2px(40);
                mEmptyView.setLayoutParams(layoutParams);
                mEmptyView.setTitle(mActivity.getString(R.string.feed_comment_empty));
            }
            listAdapter.addHeaderView(mEmptyView);
            //用mEmptyView postDelayed不行
            // mRecyclerView.postDelayed(new Runnable() {
            //     @Override
            //     public void run() {
            //         Log.e("TAG", "ViewHandler run postDelayed :" );
            //         listAdapter.addHeaderView(mEmptyView);
            //
            //     }
            // }, 2000);

        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (commentDialog != null && commentDialog.isAdded()) {
            commentDialog.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onPause() {

    }

    public void onResume() {

    }

    public void onBackPressed() {

    }
}
