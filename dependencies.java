Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details

> Task :app:dependencies

------------------------------------------------------------
Project :app
------------------------------------------------------------

androidApis - Configuration providing various types of Android JAR file
No dependencies

androidTestAnnotationProcessor - Classpath for the annotation processor for 'androidTest'. (n)
No dependencies

androidTestApi - API dependencies for 'androidTest' sources. (n)
No dependencies

androidTestApk - Apk dependencies for 'androidTest' sources (deprecated: use 'androidTestRuntimeOnly' instead). (n)
No dependencies

androidTestCompile - Compile dependencies for 'androidTest' sources (deprecated: use 'androidTestImplementation' instead). (n)
No dependencies

androidTestCompileOnly - Compile only dependencies for 'androidTest' sources. (n)
No dependencies

androidTestDebugAnnotationProcessor - Classpath for the annotation processor for 'androidTestDebug'. (n)
No dependencies

androidTestDebugApi - API dependencies for 'androidTestDebug' sources. (n)
No dependencies

androidTestDebugApk - Apk dependencies for 'androidTestDebug' sources (deprecated: use 'androidTestDebugRuntimeOnly' instead). (n)
No dependencies

androidTestDebugCompile - Compile dependencies for 'androidTestDebug' sources (deprecated: use 'androidTestDebugImplementation' instead). (n)
No dependencies

androidTestDebugCompileOnly - Compile only dependencies for 'androidTestDebug' sources. (n)
No dependencies

androidTestDebugImplementation - Implementation only dependencies for 'androidTestDebug' sources. (n)
No dependencies

androidTestDebugProvided - Provided dependencies for 'androidTestDebug' sources (deprecated: use 'androidTestDebugCompileOnly' instead). (n)
No dependencies

androidTestDebugRuntimeOnly - Runtime only dependencies for 'androidTestDebug' sources. (n)
No dependencies

androidTestDebugWearApp - Link to a wear app to embed for object 'androidTestDebug'. (n)
No dependencies

androidTestImplementation - Implementation only dependencies for 'androidTest' sources. (n)
No dependencies

androidTestProvided - Provided dependencies for 'androidTest' sources (deprecated: use 'androidTestCompileOnly' instead). (n)
No dependencies

androidTestRuntimeOnly - Runtime only dependencies for 'androidTest' sources. (n)
No dependencies

androidTestUtil - Additional APKs used during instrumentation testing.
No dependencies

androidTestWearApp - Link to a wear app to embed for object 'androidTest'. (n)
No dependencies

annotationProcessor - Classpath for the annotation processor for 'main'. (n)
+--- project libnavcompiler (n)
\--- androidx.databinding:databinding-compiler:3.5.3 (n)

api - API dependencies for 'main' sources. (n)
+--- project libcommon (n)
+--- androidx.databinding:databinding-common:3.5.3 (n)
+--- androidx.databinding:databinding-runtime:3.5.3 (n)
\--- androidx.databinding:databinding-adapters:3.5.3 (n)

apk - Apk dependencies for 'main' sources (deprecated: use 'runtimeOnly' instead). (n)
No dependencies

archives - Configuration for archive artifacts.
No dependencies

compile - Compile dependencies for 'main' sources (deprecated: use 'implementation' instead).
No dependencies

compileOnly - Compile only dependencies for 'main' sources. (n)
No dependencies

debugAndroidTestAnnotationProcessorClasspath - Resolved configuration for annotation-processor for variant: debugAndroidTest
No dependencies

debugAndroidTestCompileClasspath - Resolved configuration for compilation for variant: debugAndroidTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    +--- project :navigation-fragment
|    +--- project :navigation-runtime
|    +--- project :navigation-common
|    +--- project :androidx.paging-paging-common
|    +--- project :androidx.paging-paging-runtime
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
|    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |         \--- org.jetbrains:annotations:13.0
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    \--- androidx.databinding:databinding-adapters:3.5.3
|         +--- androidx.databinding:databinding-common:3.5.3
|         \--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- project :libnavannotation
+--- project :libnetwork
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common
+--- project :androidx.lifecycle-lifecycle-livedata
+--- project :androidx.lifecycle-lifecycle-livedata-core
+--- project :androidx.lifecycle-lifecycle-viewmodel
+--- project :androidx.lifecycle-lifecycle-runtime
+--- project :androidx.arch.core-core-runtime
+--- project :androidx.arch.core-core-common
+--- project :androidx.lifecycle-lifecycle-extensions
+--- project :androidx.sqlite-sqlite-framework
+--- project :androidx.sqlite-sqlite
+--- project :androidx.room-room-runtime
+--- project :androidx.room-room-common
+--- project :androidx.work-work-runtime
+--- project :androidx.loader-loader
+--- project :androidx.core-core
+--- project :androidx.fragment-fragment
+--- project :androidx.activity-activity
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- com.google.guava:listenablefuture:{strictly 1.0} -> 1.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

debugAndroidTestRuntimeClasspath - Resolved configuration for runtime for variant: debugAndroidTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    |    +--- project :navigation-runtime
|    |    |    +--- project :navigation-common
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx-collection
|    |    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.core-core
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-runtime
|    |    |    |         |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    +--- project :androidx.lifecycle-lifecycle-common
|    |    |    |         |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    \--- project :androidx.arch.core-core-common
|    |    |    |         |         \--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |         +--- project :androidx-collection (*)
|    |    |    |         \--- project :androidx.versionedparcelable-versionedparcelable
|    |    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |    |              +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |              \--- project :androidx-collection (*)
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.activity-activity
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx.savedstate-savedstate
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.arch.core-core-common (*)
|    |    |    |         \--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    \--- project :androidx.core-core (*)
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :navigation-common (*)
|    |    +--- com.google.android.material:material:1.0.0 -> 1.1.0-alpha10 (*)
|    |    \--- androidx.transition:transition:1.0.1 (*)
|    +--- project :navigation-fragment
|    |    +--- project :navigation-runtime (*)
|    |    +--- project :navigation-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.arch.core-core-runtime
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.arch.core-core-common (*)
|    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.core-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.fragment-fragment
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx-collection (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    |    \--- project :androidx.arch.core-core-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    +--- project :androidx.core-core (*)
|    |    |    +--- project :androidx.activity-activity (*)
|    |    |    +--- project :androidx.loader-loader
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx-collection (*)
|    |    |    +--- project :androidx.savedstate-savedstate (*)
|    |    |    \--- project :androidx.viewpager-viewpager
|    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |         +--- project :androidx.core-core (*)
|    |    |         \--- project :androidx.customview-customview
|    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |              +--- project :androidx.core-core (*)
|    |    |              \--- project :androidx-collection (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.activity-activity (*)
|    +--- project :navigation-runtime (*)
|    +--- project :navigation-common (*)
|    +--- project :androidx.paging-paging-common
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    \--- project :androidx.arch.core-core-common (*)
|    +--- project :androidx.paging-paging-runtime
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    +--- project :androidx.arch.core-core-runtime (*)
|    |    +--- project :androidx.paging-paging-common (*)
|    |    \--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    +--- androidx.media:media:1.0.1
|    |    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    |    \--- androidx.versionedparcelable:versionedparcelable:1.0.0
|    |    |         +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |         \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    |    \--- com.github.bumptech.glide:glide:4.8.0 -> 4.9.0 (*)
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.2.60 -> 1.3.50
|    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |    |         \--- org.jetbrains:annotations:13.0
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2 (*)
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-adapters:3.5.3
|    |    +--- androidx.databinding:databinding-common:3.5.3
|    |    \--- androidx.databinding:databinding-runtime:3.5.3 (*)
|    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    +--- project :androidx.lifecycle-lifecycle-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- androidx.viewpager2:viewpager2:1.0.0-beta04 (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    +--- project :androidx.lifecycle-lifecycle-extensions
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.fragment-fragment (*)
|    |    +--- project :androidx.activity-activity (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.core-core (*)
|    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    +--- androidx.camera:camera-camera2:1.0.0-alpha04
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03 (*)
|    \--- androidx.camera:camera-extensions:1.0.0-alpha01
|         +--- com.google.guava:listenablefuture:1.0
|         +--- com.google.auto.value:auto-value-annotations:1.6.3
|         +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|         \--- androidx.camera:camera-camera2:1.0.0-alpha04 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- project :libnavannotation
+--- project :libnetwork
|    +--- com.squareup.okhttp3:okhttp:4.2.0 (*)
|    +--- com.squareup.okhttp3:logging-interceptor:3.5.0
|    |    \--- com.squareup.okhttp3:okhttp:3.5.0 -> 4.2.0 (*)
|    +--- project :libcommon (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    \--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common (*)
+--- project :androidx.lifecycle-lifecycle-livedata (*)
+--- project :androidx.lifecycle-lifecycle-livedata-core (*)
+--- project :androidx.lifecycle-lifecycle-viewmodel (*)
+--- project :androidx.lifecycle-lifecycle-runtime (*)
+--- project :androidx.arch.core-core-runtime (*)
+--- project :androidx.arch.core-core-common (*)
+--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- project :androidx.sqlite-sqlite-framework
|    +--- androidx.annotation:annotation:1.1.0
|    \--- project :androidx.sqlite-sqlite
|         \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.sqlite-sqlite (*)
+--- project :androidx.room-room-runtime
|    +--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.sqlite-sqlite (*)
|    +--- project :androidx.arch.core-core-runtime (*)
|    +--- project :androidx.sqlite-sqlite-framework (*)
|    +--- project :androidx.room-room-common
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.paging-paging-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- project :androidx-collection (*)
|    +--- project :androidx.core-core (*)
|    \--- project :androidx.arch.core-core-common (*)
+--- project :androidx.room-room-common (*)
+--- project :androidx.work-work-runtime
|    \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.loader-loader (*)
+--- project :androidx.core-core (*)
+--- project :androidx.fragment-fragment (*)
+--- project :androidx.activity-activity (*)
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.camera:camera-camera2:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- androidx.camera:camera-extensions:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okhttp3:logging-interceptor:{strictly 3.5.0} -> 3.5.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.media:media:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.versionedparcelable:versionedparcelable:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

debugAnnotationProcessor - Classpath for the annotation processor for 'debug'. (n)
No dependencies

debugAnnotationProcessorClasspath - Resolved configuration for annotation-processor for variant: debug
+--- project :libnavcompiler
|    +--- project :libnavannotation
|    +--- com.alibaba:fastjson:1.2.59
|    \--- com.google.auto.service:auto-service:1.0-rc6
|         +--- com.google.auto.service:auto-service-annotations:1.0-rc6
|         +--- com.google.auto:auto-common:0.10
|         |    \--- com.google.guava:guava:23.5-jre -> 27.0.1-jre
|         |         +--- com.google.guava:failureaccess:1.0.1
|         |         +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|         |         +--- com.google.code.findbugs:jsr305:3.0.2
|         |         +--- org.checkerframework:checker-qual:2.5.2
|         |         +--- com.google.errorprone:error_prone_annotations:2.2.0
|         |         +--- com.google.j2objc:j2objc-annotations:1.1
|         |         \--- org.codehaus.mojo:animal-sniffer-annotations:1.17
|         \--- com.google.guava:guava:27.0.1-jre (*)
\--- androidx.databinding:databinding-compiler:3.5.3
     +--- androidx.databinding:databinding-compiler-common:3.5.3
     |    +--- androidx.databinding:databinding-common:3.5.3
     |    +--- com.android.databinding:baseLibrary:3.5.3
     |    +--- org.antlr:antlr4:4.5.3
     |    +--- commons-io:commons-io:2.4
     |    +--- com.googlecode.juniversalchardet:juniversalchardet:1.0.3
     |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    +--- com.squareup:javapoet:1.8.0
     |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50
     |    |    +--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
     |    |    |    +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
     |    |    |    \--- org.jetbrains:annotations:13.0
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50
     |    |         \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
     |    +--- com.google.code.gson:gson:2.8.5
     |    +--- com.android.tools:annotations:26.5.3
     |    \--- com.android.tools.build.jetifier:jetifier-core:1.0.0-beta04
     |         +--- com.google.code.gson:gson:2.8.0 -> 2.8.5
     |         \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.0 -> 1.3.50 (*)
     +--- androidx.databinding:databinding-common:3.5.3
     +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     +--- com.google.auto:auto-common:0.10 (*)
     +--- commons-io:commons-io:2.4
     +--- commons-codec:commons-codec:1.10
     +--- org.antlr:antlr4:4.5.3
     \--- com.googlecode.juniversalchardet:juniversalchardet:1.0.3

debugApi - API dependencies for 'debug' sources. (n)
No dependencies

debugApiElements - API elements for debug (n)
No dependencies

debugApk - Apk dependencies for 'debug' sources (deprecated: use 'debugRuntimeOnly' instead). (n)
No dependencies

debugBundleElements - Bundle elements for debug (n)
No dependencies

debugCompile - Compile dependencies for 'debug' sources (deprecated: use 'debugImplementation' instead). (n)
No dependencies

debugCompileClasspath - Resolved configuration for compilation for variant: debug
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    +--- project :navigation-fragment
|    +--- project :navigation-runtime
|    +--- project :navigation-common
|    +--- project :androidx.paging-paging-common
|    +--- project :androidx.paging-paging-runtime
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
|    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |         \--- org.jetbrains:annotations:13.0
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    \--- androidx.databinding:databinding-adapters:3.5.3
|         +--- androidx.databinding:databinding-common:3.5.3
|         \--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- project :libnavannotation
+--- project :libnetwork
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common
+--- project :androidx.lifecycle-lifecycle-livedata
+--- project :androidx.lifecycle-lifecycle-livedata-core
+--- project :androidx.lifecycle-lifecycle-viewmodel
+--- project :androidx.lifecycle-lifecycle-runtime
+--- project :androidx.arch.core-core-runtime
+--- project :androidx.arch.core-core-common
+--- project :androidx.lifecycle-lifecycle-extensions
+--- project :androidx.sqlite-sqlite-framework
+--- project :androidx.sqlite-sqlite
+--- project :androidx.room-room-runtime
+--- project :androidx.room-room-common
+--- project :androidx.work-work-runtime
+--- project :androidx.loader-loader
+--- project :androidx.core-core
+--- project :androidx.fragment-fragment
+--- project :androidx.activity-activity
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- com.google.guava:listenablefuture:{strictly 1.0} -> 1.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

debugCompileOnly - Compile only dependencies for 'debug' sources. (n)
No dependencies

debugImplementation - Implementation only dependencies for 'debug' sources. (n)
No dependencies

debugMetadataElements (n)
No dependencies

debugMetadataValues - Metadata Values dependencies for the base Split
No dependencies

debugProvided - Provided dependencies for 'debug' sources (deprecated: use 'debugCompileOnly' instead). (n)
No dependencies

debugRuntimeClasspath - Resolved configuration for runtime for variant: debug
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    |    +--- project :navigation-runtime
|    |    |    +--- project :navigation-common
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx-collection
|    |    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.core-core
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-runtime
|    |    |    |         |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    +--- project :androidx.lifecycle-lifecycle-common
|    |    |    |         |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    \--- project :androidx.arch.core-core-common
|    |    |    |         |         \--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |         +--- project :androidx-collection (*)
|    |    |    |         \--- project :androidx.versionedparcelable-versionedparcelable
|    |    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |    |              +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |              \--- project :androidx-collection (*)
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.activity-activity
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx.savedstate-savedstate
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.arch.core-core-common (*)
|    |    |    |         \--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    \--- project :androidx.core-core (*)
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :navigation-common (*)
|    |    +--- com.google.android.material:material:1.0.0 -> 1.1.0-alpha10 (*)
|    |    \--- androidx.transition:transition:1.0.1 (*)
|    +--- project :navigation-fragment
|    |    +--- project :navigation-runtime (*)
|    |    +--- project :navigation-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.arch.core-core-runtime
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.arch.core-core-common (*)
|    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.core-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.fragment-fragment
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx-collection (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    |    \--- project :androidx.arch.core-core-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    +--- project :androidx.core-core (*)
|    |    |    +--- project :androidx.activity-activity (*)
|    |    |    +--- project :androidx.loader-loader
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx-collection (*)
|    |    |    +--- project :androidx.savedstate-savedstate (*)
|    |    |    \--- project :androidx.viewpager-viewpager
|    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |         +--- project :androidx.core-core (*)
|    |    |         \--- project :androidx.customview-customview
|    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |              +--- project :androidx.core-core (*)
|    |    |              \--- project :androidx-collection (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.activity-activity (*)
|    +--- project :navigation-runtime (*)
|    +--- project :navigation-common (*)
|    +--- project :androidx.paging-paging-common
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    \--- project :androidx.arch.core-core-common (*)
|    +--- project :androidx.paging-paging-runtime
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    +--- project :androidx.arch.core-core-runtime (*)
|    |    +--- project :androidx.paging-paging-common (*)
|    |    \--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    +--- androidx.media:media:1.0.1
|    |    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    |    \--- androidx.versionedparcelable:versionedparcelable:1.0.0
|    |    |         +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |         \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    |    \--- com.github.bumptech.glide:glide:4.8.0 -> 4.9.0 (*)
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.2.60 -> 1.3.50
|    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |    |         \--- org.jetbrains:annotations:13.0
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2 (*)
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-adapters:3.5.3
|    |    +--- androidx.databinding:databinding-common:3.5.3
|    |    \--- androidx.databinding:databinding-runtime:3.5.3 (*)
|    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    +--- project :androidx.lifecycle-lifecycle-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- androidx.viewpager2:viewpager2:1.0.0-beta04 (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    +--- project :androidx.lifecycle-lifecycle-extensions
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.fragment-fragment (*)
|    |    +--- project :androidx.activity-activity (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.core-core (*)
|    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    +--- androidx.camera:camera-camera2:1.0.0-alpha04
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03 (*)
|    \--- androidx.camera:camera-extensions:1.0.0-alpha01
|         +--- com.google.guava:listenablefuture:1.0
|         +--- com.google.auto.value:auto-value-annotations:1.6.3
|         +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|         \--- androidx.camera:camera-camera2:1.0.0-alpha04 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
|    +--- com.squareup.okhttp3:okhttp:4.2.0 (*)
|    +--- com.squareup.okhttp3:logging-interceptor:3.5.0
|    |    \--- com.squareup.okhttp3:okhttp:3.5.0 -> 4.2.0 (*)
|    +--- project :libcommon (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    \--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common (*)
+--- project :androidx.lifecycle-lifecycle-livedata (*)
+--- project :androidx.lifecycle-lifecycle-livedata-core (*)
+--- project :androidx.lifecycle-lifecycle-viewmodel (*)
+--- project :androidx.lifecycle-lifecycle-runtime (*)
+--- project :androidx.arch.core-core-runtime (*)
+--- project :androidx.arch.core-core-common (*)
+--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- project :androidx.sqlite-sqlite-framework
|    +--- androidx.annotation:annotation:1.1.0
|    \--- project :androidx.sqlite-sqlite
|         \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.sqlite-sqlite (*)
+--- project :androidx.room-room-runtime
|    +--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.sqlite-sqlite (*)
|    +--- project :androidx.arch.core-core-runtime (*)
|    +--- project :androidx.sqlite-sqlite-framework (*)
|    +--- project :androidx.room-room-common
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.paging-paging-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- project :androidx-collection (*)
|    +--- project :androidx.core-core (*)
|    \--- project :androidx.arch.core-core-common (*)
+--- project :androidx.room-room-common (*)
+--- project :androidx.work-work-runtime
|    \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.loader-loader (*)
+--- project :androidx.core-core (*)
+--- project :androidx.fragment-fragment (*)
\--- project :androidx.activity-activity (*)

debugRuntimeElements - Runtime elements for debug (n)
No dependencies

debugRuntimeOnly - Runtime only dependencies for 'debug' sources. (n)
No dependencies

debugUnitTestAnnotationProcessorClasspath - Resolved configuration for annotation-processor for variant: debugUnitTest
No dependencies

debugUnitTestCompileClasspath - Resolved configuration for compilation for variant: debugUnitTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    +--- project :navigation-fragment
|    +--- project :navigation-runtime
|    +--- project :navigation-common
|    +--- project :androidx.paging-paging-common
|    +--- project :androidx.paging-paging-runtime
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
|    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |         \--- org.jetbrains:annotations:13.0
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    \--- androidx.databinding:databinding-adapters:3.5.3
|         +--- androidx.databinding:databinding-common:3.5.3
|         \--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- project :libnavannotation
+--- project :libnetwork
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common
+--- project :androidx.lifecycle-lifecycle-livedata
+--- project :androidx.lifecycle-lifecycle-livedata-core
+--- project :androidx.lifecycle-lifecycle-viewmodel
+--- project :androidx.lifecycle-lifecycle-runtime
+--- project :androidx.arch.core-core-runtime
+--- project :androidx.arch.core-core-common
+--- project :androidx.lifecycle-lifecycle-extensions
+--- project :androidx.sqlite-sqlite-framework
+--- project :androidx.sqlite-sqlite
+--- project :androidx.room-room-runtime
+--- project :androidx.room-room-common
+--- project :androidx.work-work-runtime
+--- project :androidx.loader-loader
+--- project :androidx.core-core
+--- project :androidx.fragment-fragment
+--- project :androidx.activity-activity
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- com.google.guava:listenablefuture:{strictly 1.0} -> 1.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

debugUnitTestRuntimeClasspath - Resolved configuration for runtime for variant: debugUnitTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    |    +--- project :navigation-runtime
|    |    |    +--- project :navigation-common
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx-collection
|    |    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.core-core
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-runtime
|    |    |    |         |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    +--- project :androidx.lifecycle-lifecycle-common
|    |    |    |         |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    \--- project :androidx.arch.core-core-common
|    |    |    |         |         \--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |         +--- project :androidx-collection (*)
|    |    |    |         \--- project :androidx.versionedparcelable-versionedparcelable
|    |    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |    |              +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |              \--- project :androidx-collection (*)
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.activity-activity
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx.savedstate-savedstate
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.arch.core-core-common (*)
|    |    |    |         \--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    \--- project :androidx.core-core (*)
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :navigation-common (*)
|    |    +--- com.google.android.material:material:1.0.0 -> 1.1.0-alpha10 (*)
|    |    \--- androidx.transition:transition:1.0.1 (*)
|    +--- project :navigation-fragment
|    |    +--- project :navigation-runtime (*)
|    |    +--- project :navigation-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.arch.core-core-runtime
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.arch.core-core-common (*)
|    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.core-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.fragment-fragment
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx-collection (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    |    \--- project :androidx.arch.core-core-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    +--- project :androidx.core-core (*)
|    |    |    +--- project :androidx.activity-activity (*)
|    |    |    +--- project :androidx.loader-loader
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx-collection (*)
|    |    |    +--- project :androidx.savedstate-savedstate (*)
|    |    |    \--- project :androidx.viewpager-viewpager
|    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |         +--- project :androidx.core-core (*)
|    |    |         \--- project :androidx.customview-customview
|    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |              +--- project :androidx.core-core (*)
|    |    |              \--- project :androidx-collection (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.activity-activity (*)
|    +--- project :navigation-runtime (*)
|    +--- project :navigation-common (*)
|    +--- project :androidx.paging-paging-common
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    \--- project :androidx.arch.core-core-common (*)
|    +--- project :androidx.paging-paging-runtime
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    +--- project :androidx.arch.core-core-runtime (*)
|    |    +--- project :androidx.paging-paging-common (*)
|    |    \--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    +--- androidx.media:media:1.0.1
|    |    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    |    \--- androidx.versionedparcelable:versionedparcelable:1.0.0
|    |    |         +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |         \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    |    \--- com.github.bumptech.glide:glide:4.8.0 -> 4.9.0 (*)
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.2.60 -> 1.3.50
|    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |    |         \--- org.jetbrains:annotations:13.0
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2 (*)
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-adapters:3.5.3
|    |    +--- androidx.databinding:databinding-common:3.5.3
|    |    \--- androidx.databinding:databinding-runtime:3.5.3 (*)
|    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    +--- project :androidx.lifecycle-lifecycle-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- androidx.viewpager2:viewpager2:1.0.0-beta04 (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    +--- project :androidx.lifecycle-lifecycle-extensions
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.fragment-fragment (*)
|    |    +--- project :androidx.activity-activity (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.core-core (*)
|    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    +--- androidx.camera:camera-camera2:1.0.0-alpha04
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03 (*)
|    \--- androidx.camera:camera-extensions:1.0.0-alpha01
|         +--- com.google.guava:listenablefuture:1.0
|         +--- com.google.auto.value:auto-value-annotations:1.6.3
|         +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|         \--- androidx.camera:camera-camera2:1.0.0-alpha04 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
|    +--- com.squareup.okhttp3:okhttp:4.2.0 (*)
|    +--- com.squareup.okhttp3:logging-interceptor:3.5.0
|    |    \--- com.squareup.okhttp3:okhttp:3.5.0 -> 4.2.0 (*)
|    +--- project :libcommon (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    \--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common (*)
+--- project :androidx.lifecycle-lifecycle-livedata (*)
+--- project :androidx.lifecycle-lifecycle-livedata-core (*)
+--- project :androidx.lifecycle-lifecycle-viewmodel (*)
+--- project :androidx.lifecycle-lifecycle-runtime (*)
+--- project :androidx.arch.core-core-runtime (*)
+--- project :androidx.arch.core-core-common (*)
+--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- project :androidx.sqlite-sqlite-framework
|    +--- androidx.annotation:annotation:1.1.0
|    \--- project :androidx.sqlite-sqlite
|         \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.sqlite-sqlite (*)
+--- project :androidx.room-room-runtime
|    +--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.sqlite-sqlite (*)
|    +--- project :androidx.arch.core-core-runtime (*)
|    +--- project :androidx.sqlite-sqlite-framework (*)
|    +--- project :androidx.room-room-common
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.paging-paging-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- project :androidx-collection (*)
|    +--- project :androidx.core-core (*)
|    \--- project :androidx.arch.core-core-common (*)
+--- project :androidx.room-room-common (*)
+--- project :androidx.work-work-runtime
|    \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.loader-loader (*)
+--- project :androidx.core-core (*)
+--- project :androidx.fragment-fragment (*)
\--- project :androidx.activity-activity (*)

debugWearApp - Link to a wear app to embed for object 'debug'. (n)
No dependencies

debugWearBundling - Resolved Configuration for wear app bundling for variant: debug
No dependencies

default - Configuration for default artifacts.
No dependencies

implementation - Implementation only dependencies for 'main' sources. (n)
+--- unspecified (n)
+--- project libnavannotation (n)
+--- project libnetwork (n)
+--- unspecified (n)
+--- com.tencent.bugly:crashreport:latest.release (n)
+--- com.tencent.bugly:nativecrashreport:latest.release (n)
+--- com.facebook.stetho:stetho:1.4.2 (n)
+--- project androidx.lifecycle-lifecycle-common (n)
+--- project androidx.lifecycle-lifecycle-livedata (n)
+--- project androidx.lifecycle-lifecycle-livedata-core (n)
+--- project androidx.lifecycle-lifecycle-viewmodel (n)
+--- project androidx.lifecycle-lifecycle-runtime (n)
+--- project androidx.arch.core-core-runtime (n)
+--- project androidx.arch.core-core-common (n)
+--- project androidx.lifecycle-lifecycle-extensions (n)
+--- project androidx.sqlite-sqlite-framework (n)
+--- project androidx.sqlite-sqlite (n)
+--- project androidx.room-room-runtime (n)
+--- project androidx.room-room-common (n)
+--- project androidx.work-work-runtime (n)
+--- project androidx.loader-loader (n)
+--- project androidx.core-core (n)
+--- project androidx.fragment-fragment (n)
\--- project androidx.activity-activity (n)

lintChecks - Configuration to apply external lint check jar
No dependencies

lintClassPath - The lint embedded classpath
\--- com.android.tools.lint:lint-gradle:26.5.3
     +--- com.android.tools:sdk-common:26.5.3
     |    +--- com.android.tools:sdklib:26.5.3
     |    |    +--- com.android.tools.layoutlib:layoutlib-api:26.5.3
     |    |    |    +--- com.android.tools:common:26.5.3
     |    |    |    |    +--- com.android.tools:annotations:26.5.3
     |    |    |    |    +--- com.google.guava:guava:27.0.1-jre
     |    |    |    |    |    +--- com.google.guava:failureaccess:1.0.1
     |    |    |    |    |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     |    |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.2
     |    |    |    |    |    +--- org.checkerframework:checker-qual:2.5.2
     |    |    |    |    |    +--- com.google.errorprone:error_prone_annotations:2.2.0
     |    |    |    |    |    +--- com.google.j2objc:j2objc-annotations:1.1
     |    |    |    |    |    \--- org.codehaus.mojo:animal-sniffer-annotations:1.17
     |    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50
     |    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
     |    |    |    |         |    +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
     |    |    |    |         |    \--- org.jetbrains:annotations:13.0
     |    |    |    |         \--- org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50
     |    |    |    |              \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
     |    |    |    +--- net.sf.kxml:kxml2:2.3.0
     |    |    |    +--- com.android.tools:annotations:26.5.3
     |    |    |    \--- org.jetbrains:annotations:13.0
     |    |    +--- com.android.tools:dvlib:26.5.3
     |    |    |    \--- com.android.tools:common:26.5.3 (*)
     |    |    +--- com.android.tools:repository:26.5.3
     |    |    |    +--- com.android.tools:common:26.5.3 (*)
     |    |    |    +--- com.sun.activation:javax.activation:1.2.0
     |    |    |    +--- org.apache.commons:commons-compress:1.12
     |    |    |    +--- org.glassfish.jaxb:jaxb-runtime:2.2.11
     |    |    |    |    +--- org.glassfish.jaxb:jaxb-core:2.2.11
     |    |    |    |    |    +--- javax.xml.bind:jaxb-api:2.2.12-b140109.1041
     |    |    |    |    |    +--- org.glassfish.jaxb:txw2:2.2.11
     |    |    |    |    |    \--- com.sun.istack:istack-commons-runtime:2.21
     |    |    |    |    +--- org.jvnet.staxex:stax-ex:1.7.7
     |    |    |    |    \--- com.sun.xml.fastinfoset:FastInfoset:1.2.13
     |    |    |    +--- com.google.jimfs:jimfs:1.1
     |    |    |    |    \--- com.google.guava:guava:18.0 -> 27.0.1-jre (*)
     |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    |    +--- com.google.code.gson:gson:2.8.5
     |    |    +--- org.apache.commons:commons-compress:1.12
     |    |    +--- org.apache.httpcomponents:httpmime:4.5.6
     |    |    |    \--- org.apache.httpcomponents:httpclient:4.5.6
     |    |    |         +--- org.apache.httpcomponents:httpcore:4.4.10
     |    |    |         +--- commons-logging:commons-logging:1.2
     |    |    |         \--- commons-codec:commons-codec:1.10
     |    |    \--- org.apache.httpcomponents:httpcore:4.4.10
     |    +--- com.android.tools.build:builder-test-api:3.5.3
     |    |    \--- com.android.tools.ddms:ddmlib:26.5.3
     |    |         +--- com.android.tools:common:26.5.3 (*)
     |    |         \--- net.sf.kxml:kxml2:2.3.0
     |    +--- com.android.tools.build:builder-model:3.5.3
     |    |    \--- com.android.tools:annotations:26.5.3
     |    +--- com.android.tools.ddms:ddmlib:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:shared:26.5.3
     |    |    +--- com.android.tools.analytics-library:protos:26.5.3
     |    |    |    \--- com.google.protobuf:protobuf-java:3.4.0
     |    |    +--- com.android.tools:annotations:26.5.3
     |    |    +--- com.android.tools:common:26.5.3 (*)
     |    |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    |    +--- com.google.code.gson:gson:2.8.5
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    +--- org.bouncycastle:bcpkix-jdk15on:1.56
     |    |    \--- org.bouncycastle:bcprov-jdk15on:1.56
     |    +--- org.bouncycastle:bcprov-jdk15on:1.56
     |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    +--- org.jetbrains.kotlin:kotlin-reflect:1.3.50
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
     |    +--- com.google.protobuf:protobuf-java:3.4.0
     |    +--- javax.inject:javax.inject:1
     |    +--- org.jetbrains.trove4j:trove4j:20160824
     |    \--- com.android.tools.build:aapt2-proto:0.4.0
     |         \--- com.google.protobuf:protobuf-java:3.4.0
     +--- com.android.tools.build:builder:3.5.3
     |    +--- com.android.tools.build:builder-model:3.5.3 (*)
     |    +--- com.android.tools.build:builder-test-api:3.5.3 (*)
     |    +--- com.android.tools:sdklib:26.5.3 (*)
     |    +--- com.android.tools:sdk-common:26.5.3 (*)
     |    +--- com.android.tools:common:26.5.3 (*)
     |    +--- com.android.tools.build:manifest-merger:26.5.3
     |    |    +--- com.android.tools:common:26.5.3 (*)
     |    |    +--- com.android.tools:sdklib:26.5.3 (*)
     |    |    +--- com.android.tools:sdk-common:26.5.3 (*)
     |    |    +--- com.google.code.gson:gson:2.8.5
     |    |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    |    \--- net.sf.kxml:kxml2:2.3.0
     |    +--- com.android.tools.ddms:ddmlib:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:protos:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:tracker:26.5.3
     |    |    +--- com.android.tools:annotations:26.5.3
     |    |    +--- com.android.tools:common:26.5.3 (*)
     |    |    +--- com.android.tools.analytics-library:protos:26.5.3 (*)
     |    |    +--- com.android.tools.analytics-library:shared:26.5.3 (*)
     |    |    +--- com.google.protobuf:protobuf-java:3.4.0
     |    |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    +--- com.android.tools.build:apksig:3.5.3
     |    +--- com.android.tools.build:apkzlib:3.5.3
     |    |    +--- com.google.code.findbugs:jsr305:1.3.9 -> 3.0.2
     |    |    +--- com.google.guava:guava:23.0 -> 27.0.1-jre (*)
     |    |    +--- org.bouncycastle:bcpkix-jdk15on:1.56 (*)
     |    |    +--- org.bouncycastle:bcprov-jdk15on:1.56
     |    |    \--- com.android.tools.build:apksig:3.5.3
     |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    +--- com.squareup:javawriter:2.5.0
     |    +--- org.bouncycastle:bcpkix-jdk15on:1.56 (*)
     |    +--- org.bouncycastle:bcprov-jdk15on:1.56
     |    +--- org.ow2.asm:asm:6.0
     |    +--- org.ow2.asm:asm-tree:6.0
     |    |    \--- org.ow2.asm:asm:6.0
     |    +--- javax.inject:javax.inject:1
     |    +--- org.ow2.asm:asm-commons:6.0
     |    |    \--- org.ow2.asm:asm-tree:6.0 (*)
     |    +--- org.ow2.asm:asm-util:6.0
     |    |    \--- org.ow2.asm:asm-tree:6.0 (*)
     |    +--- it.unimi.dsi:fastutil:7.2.0
     |    +--- net.sf.jopt-simple:jopt-simple:4.9
     |    \--- com.googlecode.json-simple:json-simple:1.1
     +--- com.android.tools.build:builder-model:3.5.3 (*)
     +--- com.android.tools.external.com-intellij:intellij-core:26.5.3
     |    \--- org.jetbrains.trove4j:trove4j:20160824
     +--- com.android.tools.external.com-intellij:kotlin-compiler:26.5.3
     +--- com.android.tools.external.org-jetbrains:uast:26.5.3
     +--- com.android.tools.build:manifest-merger:26.5.3 (*)
     +--- com.android.tools.lint:lint:26.5.3
     |    +--- com.android.tools.lint:lint-checks:26.5.3
     |    |    +--- com.android.tools.lint:lint-api:26.5.3
     |    |    |    +--- com.android.tools:sdk-common:26.5.3 (*)
     |    |    |    +--- com.android.tools.build:builder-model:3.5.3 (*)
     |    |    |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    |    |    +--- com.android.tools.external.com-intellij:intellij-core:26.5.3 (*)
     |    |    |    +--- com.android.tools.external.com-intellij:kotlin-compiler:26.5.3
     |    |    |    +--- com.android.tools.external.org-jetbrains:uast:26.5.3
     |    |    |    +--- com.android.tools.build:manifest-merger:26.5.3 (*)
     |    |    |    +--- org.ow2.asm:asm:6.0
     |    |    |    +--- org.ow2.asm:asm-tree:6.0 (*)
     |    |    |    +--- org.jetbrains.kotlin:kotlin-reflect:1.3.50 (*)
     |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    |    +--- com.android.tools.external.com-intellij:intellij-core:26.5.3 (*)
     |    |    +--- com.android.tools.external.com-intellij:kotlin-compiler:26.5.3
     |    |    +--- com.android.tools.external.org-jetbrains:uast:26.5.3
     |    |    \--- org.ow2.asm:asm-analysis:6.0
     |    |         \--- org.ow2.asm:asm-tree:6.0 (*)
     |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    +--- com.android.tools.external.org-jetbrains:uast:26.5.3
     |    +--- com.android.tools.external.com-intellij:kotlin-compiler:26.5.3
     |    +--- com.android.tools.build:manifest-merger:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:shared:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:protos:26.5.3 (*)
     |    +--- com.android.tools.analytics-library:tracker:26.5.3 (*)
     |    +--- org.jetbrains.kotlin:kotlin-reflect:1.3.50 (*)
     |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     +--- com.android.tools.lint:lint-gradle-api:26.5.3
     |    +--- com.android.tools:sdklib:26.5.3 (*)
     |    +--- com.android.tools.build:builder-model:3.5.3 (*)
     |    +--- com.android.tools.build:gradle-api:3.5.3
     |    |    +--- com.android.tools.build:builder-model:3.5.3 (*)
     |    |    +--- com.android.tools.build:builder-test-api:3.5.3 (*)
     |    |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    +--- org.jetbrains.kotlin:kotlin-reflect:1.3.50 (*)
     |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     |    \--- com.google.guava:guava:27.0.1-jre (*)
     +--- org.codehaus.groovy:groovy-all:2.4.15
     +--- org.jetbrains.kotlin:kotlin-reflect:1.3.50 (*)
     \--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)

lintPublish - Configuration to publish external lint check jar
No dependencies

provided - Provided dependencies for 'main' sources (deprecated: use 'compileOnly' instead). (n)
No dependencies

releaseAnnotationProcessor - Classpath for the annotation processor for 'release'. (n)
No dependencies

releaseAnnotationProcessorClasspath - Resolved configuration for annotation-processor for variant: release
+--- project :libnavcompiler
|    +--- project :libnavannotation
|    +--- com.alibaba:fastjson:1.2.59
|    \--- com.google.auto.service:auto-service:1.0-rc6
|         +--- com.google.auto.service:auto-service-annotations:1.0-rc6
|         +--- com.google.auto:auto-common:0.10
|         |    \--- com.google.guava:guava:23.5-jre -> 27.0.1-jre
|         |         +--- com.google.guava:failureaccess:1.0.1
|         |         +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
|         |         +--- com.google.code.findbugs:jsr305:3.0.2
|         |         +--- org.checkerframework:checker-qual:2.5.2
|         |         +--- com.google.errorprone:error_prone_annotations:2.2.0
|         |         +--- com.google.j2objc:j2objc-annotations:1.1
|         |         \--- org.codehaus.mojo:animal-sniffer-annotations:1.17
|         \--- com.google.guava:guava:27.0.1-jre (*)
\--- androidx.databinding:databinding-compiler:3.5.3
     +--- androidx.databinding:databinding-compiler-common:3.5.3
     |    +--- androidx.databinding:databinding-common:3.5.3
     |    +--- com.android.databinding:baseLibrary:3.5.3
     |    +--- org.antlr:antlr4:4.5.3
     |    +--- commons-io:commons-io:2.4
     |    +--- com.googlecode.juniversalchardet:juniversalchardet:1.0.3
     |    +--- com.google.guava:guava:27.0.1-jre (*)
     |    +--- com.squareup:javapoet:1.8.0
     |    +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50
     |    |    +--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
     |    |    |    +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
     |    |    |    \--- org.jetbrains:annotations:13.0
     |    |    \--- org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50
     |    |         \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
     |    +--- com.google.code.gson:gson:2.8.5
     |    +--- com.android.tools:annotations:26.5.3
     |    \--- com.android.tools.build.jetifier:jetifier-core:1.0.0-beta04
     |         +--- com.google.code.gson:gson:2.8.0 -> 2.8.5
     |         \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.0 -> 1.3.50 (*)
     +--- androidx.databinding:databinding-common:3.5.3
     +--- org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.50 (*)
     +--- com.google.auto:auto-common:0.10 (*)
     +--- commons-io:commons-io:2.4
     +--- commons-codec:commons-codec:1.10
     +--- org.antlr:antlr4:4.5.3
     \--- com.googlecode.juniversalchardet:juniversalchardet:1.0.3

releaseApi - API dependencies for 'release' sources. (n)
No dependencies

releaseApiElements - API elements for release (n)
No dependencies

releaseApk - Apk dependencies for 'release' sources (deprecated: use 'releaseRuntimeOnly' instead). (n)
No dependencies

releaseBundleElements - Bundle elements for release (n)
No dependencies

releaseCompile - Compile dependencies for 'release' sources (deprecated: use 'releaseImplementation' instead). (n)
No dependencies

releaseCompileClasspath - Resolved configuration for compilation for variant: release
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    +--- project :navigation-fragment
|    +--- project :navigation-runtime
|    +--- project :navigation-common
|    +--- project :androidx.paging-paging-common
|    +--- project :androidx.paging-paging-runtime
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
|    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |         \--- org.jetbrains:annotations:13.0
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    \--- androidx.databinding:databinding-adapters:3.5.3
|         +--- androidx.databinding:databinding-common:3.5.3
|         \--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common
+--- project :androidx.lifecycle-lifecycle-livedata
+--- project :androidx.lifecycle-lifecycle-livedata-core
+--- project :androidx.lifecycle-lifecycle-viewmodel
+--- project :androidx.lifecycle-lifecycle-runtime
+--- project :androidx.arch.core-core-runtime
+--- project :androidx.arch.core-core-common
+--- project :androidx.lifecycle-lifecycle-extensions
+--- project :androidx.sqlite-sqlite-framework
+--- project :androidx.sqlite-sqlite
+--- project :androidx.room-room-runtime
+--- project :androidx.room-room-common
+--- project :androidx.work-work-runtime
+--- project :androidx.loader-loader
+--- project :androidx.core-core
+--- project :androidx.fragment-fragment
+--- project :androidx.activity-activity
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- com.google.guava:listenablefuture:{strictly 1.0} -> 1.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

releaseCompileOnly - Compile only dependencies for 'release' sources. (n)
No dependencies

releaseImplementation - Implementation only dependencies for 'release' sources. (n)
No dependencies

releaseMetadataElements (n)
No dependencies

releaseMetadataValues - Metadata Values dependencies for the base Split
No dependencies

releaseProvided - Provided dependencies for 'release' sources (deprecated: use 'releaseCompileOnly' instead). (n)
No dependencies

releaseRuntimeClasspath - Resolved configuration for runtime for variant: release
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    |    +--- project :navigation-runtime
|    |    |    +--- project :navigation-common
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx-collection
|    |    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.core-core
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-runtime
|    |    |    |         |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    +--- project :androidx.lifecycle-lifecycle-common
|    |    |    |         |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    \--- project :androidx.arch.core-core-common
|    |    |    |         |         \--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |         +--- project :androidx-collection (*)
|    |    |    |         \--- project :androidx.versionedparcelable-versionedparcelable
|    |    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |    |              +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |              \--- project :androidx-collection (*)
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.activity-activity
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx.savedstate-savedstate
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.arch.core-core-common (*)
|    |    |    |         \--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    \--- project :androidx.core-core (*)
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :navigation-common (*)
|    |    +--- com.google.android.material:material:1.0.0 -> 1.1.0-alpha10 (*)
|    |    \--- androidx.transition:transition:1.0.1 (*)
|    +--- project :navigation-fragment
|    |    +--- project :navigation-runtime (*)
|    |    +--- project :navigation-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.arch.core-core-runtime
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.arch.core-core-common (*)
|    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.core-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.fragment-fragment
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx-collection (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    |    \--- project :androidx.arch.core-core-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    +--- project :androidx.core-core (*)
|    |    |    +--- project :androidx.activity-activity (*)
|    |    |    +--- project :androidx.loader-loader
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx-collection (*)
|    |    |    +--- project :androidx.savedstate-savedstate (*)
|    |    |    \--- project :androidx.viewpager-viewpager
|    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |         +--- project :androidx.core-core (*)
|    |    |         \--- project :androidx.customview-customview
|    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |              +--- project :androidx.core-core (*)
|    |    |              \--- project :androidx-collection (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.activity-activity (*)
|    +--- project :navigation-runtime (*)
|    +--- project :navigation-common (*)
|    +--- project :androidx.paging-paging-common
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    \--- project :androidx.arch.core-core-common (*)
|    +--- project :androidx.paging-paging-runtime
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    +--- project :androidx.arch.core-core-runtime (*)
|    |    +--- project :androidx.paging-paging-common (*)
|    |    \--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    +--- androidx.media:media:1.0.1
|    |    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    |    \--- androidx.versionedparcelable:versionedparcelable:1.0.0
|    |    |         +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |         \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    |    \--- com.github.bumptech.glide:glide:4.8.0 -> 4.9.0 (*)
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.2.60 -> 1.3.50
|    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |    |         \--- org.jetbrains:annotations:13.0
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2 (*)
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-adapters:3.5.3
|    |    +--- androidx.databinding:databinding-common:3.5.3
|    |    \--- androidx.databinding:databinding-runtime:3.5.3 (*)
|    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    +--- project :androidx.lifecycle-lifecycle-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- androidx.viewpager2:viewpager2:1.0.0-beta04 (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    +--- project :androidx.lifecycle-lifecycle-extensions
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.fragment-fragment (*)
|    |    +--- project :androidx.activity-activity (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.core-core (*)
|    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    +--- androidx.camera:camera-camera2:1.0.0-alpha04
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03 (*)
|    \--- androidx.camera:camera-extensions:1.0.0-alpha01
|         +--- com.google.guava:listenablefuture:1.0
|         +--- com.google.auto.value:auto-value-annotations:1.6.3
|         +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|         \--- androidx.camera:camera-camera2:1.0.0-alpha04 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
|    +--- com.squareup.okhttp3:okhttp:4.2.0 (*)
|    +--- com.squareup.okhttp3:logging-interceptor:3.5.0
|    |    \--- com.squareup.okhttp3:okhttp:3.5.0 -> 4.2.0 (*)
|    +--- project :libcommon (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    \--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common (*)
+--- project :androidx.lifecycle-lifecycle-livedata (*)
+--- project :androidx.lifecycle-lifecycle-livedata-core (*)
+--- project :androidx.lifecycle-lifecycle-viewmodel (*)
+--- project :androidx.lifecycle-lifecycle-runtime (*)
+--- project :androidx.arch.core-core-runtime (*)
+--- project :androidx.arch.core-core-common (*)
+--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- project :androidx.sqlite-sqlite-framework
|    +--- androidx.annotation:annotation:1.1.0
|    \--- project :androidx.sqlite-sqlite
|         \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.sqlite-sqlite (*)
+--- project :androidx.room-room-runtime
|    +--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.sqlite-sqlite (*)
|    +--- project :androidx.arch.core-core-runtime (*)
|    +--- project :androidx.sqlite-sqlite-framework (*)
|    +--- project :androidx.room-room-common
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.paging-paging-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- project :androidx-collection (*)
|    +--- project :androidx.core-core (*)
|    \--- project :androidx.arch.core-core-common (*)
+--- project :androidx.room-room-common (*)
+--- project :androidx.work-work-runtime
|    \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.loader-loader (*)
+--- project :androidx.core-core (*)
+--- project :androidx.fragment-fragment (*)
\--- project :androidx.activity-activity (*)

releaseRuntimeElements - Runtime elements for release (n)
No dependencies

releaseRuntimeOnly - Runtime only dependencies for 'release' sources. (n)
No dependencies

releaseUnitTestAnnotationProcessorClasspath - Resolved configuration for annotation-processor for variant: releaseUnitTest
No dependencies

releaseUnitTestCompileClasspath - Resolved configuration for compilation for variant: releaseUnitTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    +--- project :navigation-fragment
|    +--- project :navigation-runtime
|    +--- project :navigation-common
|    +--- project :androidx.paging-paging-common
|    +--- project :androidx.paging-paging-runtime
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50
|    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |         \--- org.jetbrains:annotations:13.0
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    \--- androidx.databinding:databinding-adapters:3.5.3
|         +--- androidx.databinding:databinding-common:3.5.3
|         \--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common
+--- project :androidx.lifecycle-lifecycle-livedata
+--- project :androidx.lifecycle-lifecycle-livedata-core
+--- project :androidx.lifecycle-lifecycle-viewmodel
+--- project :androidx.lifecycle-lifecycle-runtime
+--- project :androidx.arch.core-core-runtime
+--- project :androidx.arch.core-core-common
+--- project :androidx.lifecycle-lifecycle-extensions
+--- project :androidx.sqlite-sqlite-framework
+--- project :androidx.sqlite-sqlite
+--- project :androidx.room-room-runtime
+--- project :androidx.room-room-common
+--- project :androidx.work-work-runtime
+--- project :androidx.loader-loader
+--- project :androidx.core-core
+--- project :androidx.fragment-fragment
+--- project :androidx.activity-activity
+--- androidx.databinding:databinding-common:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-runtime:{strictly 3.5.3} -> 3.5.3 (c)
+--- androidx.databinding:databinding-adapters:{strictly 3.5.3} -> 3.5.3 (c)
+--- com.tencent.bugly:crashreport:{strictly 3.1.9} -> 3.1.9 (c)
+--- com.tencent.bugly:nativecrashreport:{strictly 3.7.1} -> 3.7.1 (c)
+--- com.facebook.stetho:stetho:{strictly 1.4.2} -> 1.4.2 (c)
+--- androidx.appcompat:appcompat:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.material:material:{strictly 1.1.0-alpha10} -> 1.1.0-alpha10 (c)
+--- androidx.constraintlayout:constraintlayout:{strictly 1.1.3} -> 1.1.3 (c)
+--- com.scwang.smartrefresh:SmartRefreshLayout:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.scwang.smartrefresh:SmartRefreshHeader:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.google.android.exoplayer:exoplayer-core:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-dash:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.google.android.exoplayer:exoplayer-ui:{strictly 2.10.4} -> 2.10.4 (c)
+--- com.github.bumptech.glide:glide:{strictly 4.9.0} -> 4.9.0 (c)
+--- jp.wasabeef:glide-transformations:{strictly 4.0.0} -> 4.0.0 (c)
+--- androidx.camera:camera-view:{strictly 1.0.0-alpha01} -> 1.0.0-alpha01 (c)
+--- androidx.work:work-runtime:{strictly 2.2.0} -> 2.2.0 (c)
+--- com.github.chrisbanes:PhotoView:{strictly 2.3.0} -> 2.3.0 (c)
+--- com.aliyun.dpa:oss-android-sdk:{strictly 2.9.3} -> 2.9.3 (c)
+--- com.alibaba:fastjson:{strictly 1.2.59} -> 1.2.59 (c)
+--- androidx.collection:collection:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.lifecycle:lifecycle-runtime:{strictly 2.0.0} -> 2.0.0 (c)
+--- commons-cli:commons-cli:{strictly 1.2} -> 1.2 (c)
+--- com.google.code.findbugs:jsr305:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.annotation:annotation:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.vectordrawable:vectordrawable:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.cardview:cardview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.coordinatorlayout:coordinatorlayout:{strictly 1.1.0-beta01} -> 1.1.0-beta01 (c)
+--- androidx.recyclerview:recyclerview:{strictly 1.1.0-beta04} -> 1.1.0-beta04 (c)
+--- androidx.transition:transition:{strictly 1.0.1} -> 1.0.1 (c)
+--- androidx.viewpager2:viewpager2:{strictly 1.0.0-beta04} -> 1.0.0-beta04 (c)
+--- androidx.constraintlayout:constraintlayout-solver:{strictly 1.1.3} -> 1.1.3 (c)
+--- androidx.vectordrawable:vectordrawable-animated:{strictly 1.1.0} -> 1.1.0 (c)
+--- com.github.bumptech.glide:gifdecoder:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:disklrucache:{strictly 4.9.0} -> 4.9.0 (c)
+--- com.github.bumptech.glide:annotations:{strictly 4.9.0} -> 4.9.0 (c)
+--- androidx.camera:camera-core:{strictly 1.0.0-alpha04} -> 1.0.0-alpha04 (c)
+--- com.google.guava:listenablefuture:{strictly 1.0} -> 1.0 (c)
+--- androidx.room:room-runtime:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.lifecycle:lifecycle-service:{strictly 2.0.0} -> 2.0.0 (c)
+--- com.squareup.okhttp3:okhttp:{strictly 4.2.0} -> 4.2.0 (c)
+--- com.squareup.okio:okio:{strictly 2.2.2} -> 2.2.2 (c)
+--- androidx.lifecycle:lifecycle-common:{strictly 2.0.0} -> 2.0.0 (c)
+--- androidx.arch.core:core-common:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.cursoradapter:cursoradapter:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.appcompat:appcompat-resources:{strictly 1.1.0} -> 1.1.0 (c)
+--- androidx.drawerlayout:drawerlayout:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.customview:customview:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.interpolator:interpolator:{strictly 1.0.0} -> 1.0.0 (c)
+--- com.google.auto.value:auto-value-annotations:{strictly 1.6.3} -> 1.6.3 (c)
+--- androidx.exifinterface:exifinterface:{strictly 1.0.0} -> 1.0.0 (c)
+--- androidx.concurrent:concurrent-futures:{strictly 1.0.0-alpha03} -> 1.0.0-alpha03 (c)
+--- androidx.room:room-common:{strictly 2.1.0} -> 2.1.0 (c)
+--- androidx.sqlite:sqlite-framework:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.sqlite:sqlite:{strictly 2.0.1} -> 2.0.1 (c)
+--- androidx.arch.core:core-runtime:{strictly 2.0.1} -> 2.0.1 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib:{strictly 1.3.50} -> 1.3.50 (c)
+--- org.jetbrains.kotlin:kotlin-stdlib-common:{strictly 1.3.50} -> 1.3.50 (c)
\--- org.jetbrains:annotations:{strictly 13.0} -> 13.0 (c)

releaseUnitTestRuntimeClasspath - Resolved configuration for runtime for variant: releaseUnitTest
+--- project :libcommon
|    +--- androidx.appcompat:appcompat:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.cursoradapter:cursoradapter:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat-resources:1.1.0
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0
|    |    |    |         \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.vectordrawable:vectordrawable-animated:1.1.0
|    |    |    |    +--- androidx.vectordrawable:vectordrawable:1.1.0 (*)
|    |    |    |    +--- androidx.interpolator:interpolator:1.0.0
|    |    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    |    \--- androidx.collection:collection:1.1.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.drawerlayout:drawerlayout:1.0.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.customview:customview:1.0.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    +--- com.google.android.material:material:1.1.0-alpha10
|    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    +--- androidx.appcompat:appcompat:1.1.0-rc01 -> 1.1.0 (*)
|    |    +--- androidx.cardview:cardview:1.0.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.coordinatorlayout:coordinatorlayout:1.1.0-beta01
|    |    |    +--- androidx.annotation:annotation:1.1.0-rc01 -> 1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0
|    |    |    +--- androidx.lifecycle:lifecycle-common:2.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.arch.core:core-common:2.0.0 -> 2.0.1
|    |    |    |    \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.recyclerview:recyclerview:1.0.0 -> 1.1.0-beta04
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.customview:customview:1.0.0 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    +--- androidx.transition:transition:1.0.1
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- androidx.vectordrawable:vectordrawable:1.1.0-rc01 -> 1.1.0 (*)
|    |    \--- androidx.viewpager2:viewpager2:1.0.0-beta03 -> 1.0.0-beta04
|    |         +--- androidx.annotation:annotation:1.1.0
|    |         +--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    |         \--- androidx.collection:collection:1.1.0 (*)
|    +--- androidx.constraintlayout:constraintlayout:1.1.3
|    |    \--- androidx.constraintlayout:constraintlayout-solver:1.1.3
|    +--- project :navigation-ui
|    |    +--- project :navigation-runtime
|    |    |    +--- project :navigation-common
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx-collection
|    |    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.core-core
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-runtime
|    |    |    |         |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    +--- project :androidx.lifecycle-lifecycle-common
|    |    |    |         |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    |         |    \--- project :androidx.arch.core-core-common
|    |    |    |         |         \--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |         +--- project :androidx-collection (*)
|    |    |    |         \--- project :androidx.versionedparcelable-versionedparcelable
|    |    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |    |              +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |              \--- project :androidx-collection (*)
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.activity-activity
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx.savedstate-savedstate
|    |    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |    |         +--- project :androidx.arch.core-core-common (*)
|    |    |    |         \--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    \--- project :androidx.core-core (*)
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :navigation-common (*)
|    |    +--- com.google.android.material:material:1.0.0 -> 1.1.0-alpha10 (*)
|    |    \--- androidx.transition:transition:1.0.1 (*)
|    +--- project :navigation-fragment
|    |    +--- project :navigation-runtime (*)
|    |    +--- project :navigation-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.arch.core-core-runtime
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    \--- project :androidx.arch.core-core-common (*)
|    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.core-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.fragment-fragment
|    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    +--- project :androidx-collection (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.arch.core-core-common (*)
|    |    |    |    \--- project :androidx.arch.core-core-runtime (*)
|    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    +--- project :androidx.core-core (*)
|    |    |    +--- project :androidx.activity-activity (*)
|    |    |    +--- project :androidx.loader-loader
|    |    |    |    +--- androidx.annotation:annotation:1.1.0
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    |    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    |    |    +--- project :androidx.core-core (*)
|    |    |    |    \--- project :androidx-collection (*)
|    |    |    +--- project :androidx.savedstate-savedstate (*)
|    |    |    \--- project :androidx.viewpager-viewpager
|    |    |         +--- androidx.annotation:annotation:1.1.0
|    |    |         +--- project :androidx.core-core (*)
|    |    |         \--- project :androidx.customview-customview
|    |    |              +--- androidx.annotation:annotation:1.1.0
|    |    |              +--- project :androidx.core-core (*)
|    |    |              \--- project :androidx-collection (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.activity-activity (*)
|    +--- project :navigation-runtime (*)
|    +--- project :navigation-common (*)
|    +--- project :androidx.paging-paging-common
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    \--- project :androidx.arch.core-core-common (*)
|    +--- project :androidx.paging-paging-runtime
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    |    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    |    +--- project :androidx.arch.core-core-runtime (*)
|    |    +--- project :androidx.paging-paging-common (*)
|    |    \--- androidx.recyclerview:recyclerview:1.1.0-beta04 (*)
|    +--- com.scwang.smartrefresh:SmartRefreshLayout:1.1.0
|    +--- com.scwang.smartrefresh:SmartRefreshHeader:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-core:2.10.4
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-dash:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.google.android.exoplayer:exoplayer-ui:2.10.4
|    |    +--- com.google.android.exoplayer:exoplayer-core:2.10.4 (*)
|    |    +--- androidx.media:media:1.0.1
|    |    |    +--- androidx.annotation:annotation:1.0.1 -> 1.1.0
|    |    |    \--- androidx.versionedparcelable:versionedparcelable:1.0.0
|    |    |         +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |         \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- com.github.bumptech.glide:glide:4.9.0
|    |    +--- com.github.bumptech.glide:gifdecoder:4.9.0
|    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    +--- com.github.bumptech.glide:disklrucache:4.9.0
|    |    +--- com.github.bumptech.glide:annotations:4.9.0
|    |    \--- androidx.vectordrawable:vectordrawable-animated:1.0.0 -> 1.1.0 (*)
|    +--- jp.wasabeef:glide-transformations:4.0.0
|    |    \--- com.github.bumptech.glide:glide:4.8.0 -> 4.9.0 (*)
|    +--- androidx.camera:camera-view:1.0.0-alpha01
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04
|    |    |    +--- com.google.auto.value:auto-value-annotations:1.6.3
|    |    |    +--- com.google.guava:listenablefuture:1.0
|    |    |    +--- androidx.exifinterface:exifinterface:1.0.0
|    |    |    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03
|    |    |         +--- com.google.guava:listenablefuture:1.0
|    |    |         \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    +--- androidx.work:work-runtime:2.2.0
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.room:room-runtime:2.1.0
|    |    |    +--- androidx.room:room-common:2.1.0
|    |    |    |    \--- androidx.annotation:annotation:1.1.0
|    |    |    +--- androidx.sqlite:sqlite-framework:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.sqlite:sqlite:2.0.1
|    |    |    |         \--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    +--- androidx.sqlite:sqlite:2.0.1 (*)
|    |    |    +--- androidx.arch.core:core-runtime:2.0.1
|    |    |    |    +--- androidx.annotation:annotation:1.0.2 -> 1.1.0
|    |    |    |    \--- androidx.arch.core:core-common:2.0.1 (*)
|    |    |    \--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.lifecycle:lifecycle-service:2.0.0
|    |         \--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    +--- com.github.chrisbanes:PhotoView:2.3.0
|    +--- com.aliyun.dpa:oss-android-sdk:+ -> 2.9.3
|    |    +--- com.squareup.okhttp3:okhttp:3.11.0 -> 4.2.0
|    |    |    +--- com.squareup.okio:okio:2.2.2
|    |    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.2.60 -> 1.3.50
|    |    |    |         +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.3.50
|    |    |    |         \--- org.jetbrains:annotations:13.0
|    |    |    \--- org.jetbrains.kotlin:kotlin-stdlib:1.3.50 (*)
|    |    \--- com.squareup.okio:okio:1.14.0 -> 2.2.2 (*)
|    +--- com.alibaba:fastjson:1.2.59
|    +--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-runtime:3.5.3
|    |    +--- androidx.lifecycle:lifecycle-runtime:2.0.0 (*)
|    |    +--- androidx.collection:collection:1.0.0 -> 1.1.0 (*)
|    |    \--- androidx.databinding:databinding-common:3.5.3
|    +--- androidx.databinding:databinding-adapters:3.5.3
|    |    +--- androidx.databinding:databinding-common:3.5.3
|    |    \--- androidx.databinding:databinding-runtime:3.5.3 (*)
|    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    +--- project :androidx.lifecycle-lifecycle-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- androidx.viewpager2:viewpager2:1.0.0-beta04 (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    +--- project :androidx.lifecycle-lifecycle-extensions
|    |    +--- androidx.annotation:annotation:1.1.0
|    |    +--- project :androidx.lifecycle-lifecycle-viewmodel (*)
|    |    +--- project :androidx.lifecycle-lifecycle-common (*)
|    |    +--- project :androidx.fragment-fragment (*)
|    |    +--- project :androidx.activity-activity (*)
|    |    +--- project :androidx.savedstate-savedstate (*)
|    |    \--- project :androidx.core-core (*)
|    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    +--- androidx.camera:camera-camera2:1.0.0-alpha04
|    |    +--- com.google.guava:listenablefuture:1.0
|    |    +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|    |    +--- androidx.annotation:annotation:1.0.0 -> 1.1.0
|    |    \--- androidx.concurrent:concurrent-futures:1.0.0-alpha03 (*)
|    \--- androidx.camera:camera-extensions:1.0.0-alpha01
|         +--- com.google.guava:listenablefuture:1.0
|         +--- com.google.auto.value:auto-value-annotations:1.6.3
|         +--- androidx.camera:camera-core:1.0.0-alpha04 (*)
|         \--- androidx.camera:camera-camera2:1.0.0-alpha04 (*)
+--- androidx.databinding:databinding-common:3.5.3
+--- androidx.databinding:databinding-runtime:3.5.3 (*)
+--- androidx.databinding:databinding-adapters:3.5.3 (*)
+--- project :libnavannotation
+--- project :libnetwork
|    +--- com.squareup.okhttp3:okhttp:4.2.0 (*)
|    +--- com.squareup.okhttp3:logging-interceptor:3.5.0
|    |    \--- com.squareup.okhttp3:okhttp:3.5.0 -> 4.2.0 (*)
|    +--- project :libcommon (*)
|    +--- android.arch.persistence.room:runtime:1.1.1 -> androidx.room:room-runtime:2.1.0 (*)
|    \--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- com.tencent.bugly:crashreport:latest.release -> 3.1.9
+--- com.tencent.bugly:nativecrashreport:latest.release -> 3.7.1
+--- com.facebook.stetho:stetho:1.4.2
|    +--- commons-cli:commons-cli:1.2
|    \--- com.google.code.findbugs:jsr305:2.0.1
+--- project :androidx.lifecycle-lifecycle-common (*)
+--- project :androidx.lifecycle-lifecycle-livedata (*)
+--- project :androidx.lifecycle-lifecycle-livedata-core (*)
+--- project :androidx.lifecycle-lifecycle-viewmodel (*)
+--- project :androidx.lifecycle-lifecycle-runtime (*)
+--- project :androidx.arch.core-core-runtime (*)
+--- project :androidx.arch.core-core-common (*)
+--- project :androidx.lifecycle-lifecycle-extensions (*)
+--- project :androidx.sqlite-sqlite-framework
|    +--- androidx.annotation:annotation:1.1.0
|    \--- project :androidx.sqlite-sqlite
|         \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.sqlite-sqlite (*)
+--- project :androidx.room-room-runtime
|    +--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.sqlite-sqlite (*)
|    +--- project :androidx.arch.core-core-runtime (*)
|    +--- project :androidx.sqlite-sqlite-framework (*)
|    +--- project :androidx.room-room-common
|    |    \--- androidx.annotation:annotation:1.1.0
|    +--- project :androidx.paging-paging-common (*)
|    +--- project :androidx.lifecycle-lifecycle-livedata-core (*)
|    +--- project :androidx-collection (*)
|    +--- project :androidx.core-core (*)
|    \--- project :androidx.arch.core-core-common (*)
+--- project :androidx.room-room-common (*)
+--- project :androidx.work-work-runtime
|    \--- androidx.annotation:annotation:1.1.0
+--- project :androidx.loader-loader (*)
+--- project :androidx.core-core (*)
+--- project :androidx.fragment-fragment (*)
\--- project :androidx.activity-activity (*)

releaseWearApp - Link to a wear app to embed for object 'release'. (n)
No dependencies

releaseWearBundling - Resolved Configuration for wear app bundling for variant: release
No dependencies

runtimeOnly - Runtime only dependencies for 'main' sources. (n)
No dependencies

testAnnotationProcessor - Classpath for the annotation processor for 'test'. (n)
No dependencies

testApi - API dependencies for 'test' sources. (n)
No dependencies

testApk - Apk dependencies for 'test' sources (deprecated: use 'testRuntimeOnly' instead). (n)
No dependencies

testCompile - Compile dependencies for 'test' sources (deprecated: use 'testImplementation' instead).
No dependencies

testCompileOnly - Compile only dependencies for 'test' sources. (n)
No dependencies

testDebugAnnotationProcessor - Classpath for the annotation processor for 'testDebug'. (n)
No dependencies

testDebugApi - API dependencies for 'testDebug' sources. (n)
No dependencies

testDebugApk - Apk dependencies for 'testDebug' sources (deprecated: use 'testDebugRuntimeOnly' instead). (n)
No dependencies

testDebugCompile - Compile dependencies for 'testDebug' sources (deprecated: use 'testDebugImplementation' instead). (n)
No dependencies

testDebugCompileOnly - Compile only dependencies for 'testDebug' sources. (n)
No dependencies

testDebugImplementation - Implementation only dependencies for 'testDebug' sources. (n)
No dependencies

testDebugProvided - Provided dependencies for 'testDebug' sources (deprecated: use 'testDebugCompileOnly' instead). (n)
No dependencies

testDebugRuntimeOnly - Runtime only dependencies for 'testDebug' sources. (n)
No dependencies

testDebugWearApp - Link to a wear app to embed for object 'testDebug'. (n)
No dependencies

testImplementation - Implementation only dependencies for 'test' sources. (n)
No dependencies

testProvided - Provided dependencies for 'test' sources (deprecated: use 'testCompileOnly' instead). (n)
No dependencies

testReleaseAnnotationProcessor - Classpath for the annotation processor for 'testRelease'. (n)
No dependencies

testReleaseApi - API dependencies for 'testRelease' sources. (n)
No dependencies

testReleaseApk - Apk dependencies for 'testRelease' sources (deprecated: use 'testReleaseRuntimeOnly' instead). (n)
No dependencies

testReleaseCompile - Compile dependencies for 'testRelease' sources (deprecated: use 'testReleaseImplementation' instead). (n)
No dependencies

testReleaseCompileOnly - Compile only dependencies for 'testRelease' sources. (n)
No dependencies

testReleaseImplementation - Implementation only dependencies for 'testRelease' sources. (n)
No dependencies

testReleaseProvided - Provided dependencies for 'testRelease' sources (deprecated: use 'testReleaseCompileOnly' instead). (n)
No dependencies

testReleaseRuntimeOnly - Runtime only dependencies for 'testRelease' sources. (n)
No dependencies

testReleaseWearApp - Link to a wear app to embed for object 'testRelease'. (n)
No dependencies

testRuntimeOnly - Runtime only dependencies for 'test' sources. (n)
No dependencies

testWearApp - Link to a wear app to embed for object 'test'. (n)
No dependencies

wearApp - Link to a wear app to embed for object 'main'. (n)
No dependencies

(c) - dependency constraint
(*) - dependencies omitted (listed previously)

(n) - Not resolved (configuration is not meant to be resolved)

A web-based, searchable dependency report is available by adding the --scan option.

BUILD SUCCESSFUL in 19s
1 actionable task: 1 executed
