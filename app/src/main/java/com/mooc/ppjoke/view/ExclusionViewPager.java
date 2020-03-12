package com.mooc.ppjoke.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * createBy keepon
 */
public class ExclusionViewPager extends ViewPager {
    public ExclusionViewPager(@NonNull Context context,
                              @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (changed) {
            updateGestureExclusion();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        updateGestureExclusion();
    }

    List<Rect> gestureExclusionRects = new ArrayList<>();

    private void updateGestureExclusion() {
        // Skip this call if we're not running on Android 10+
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }

        // First, lets clear out any existing rectangles
        getSystemGestureExclusionRects().clear();
        gestureExclusionRects.add(new Rect(dp2Px(10), dp2Px(100), dp2Px(15), dp2Px(200)));
        // Now lets work out which areas should be excluded. For a SeekBar this will
        // be the bounds of the thumb drawable.


        // If we had other elements in this view near the edges, we could exclude them
        // here too, by adding their bounds to the list
        setSystemGestureExclusionRects(gestureExclusionRects);
    }
    private int dp2Px(int dpValue) {
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        return (int) (metrics.density * dpValue + 0.5f);
    }
}
