,
        {
        exclude group: 'androidx.lifecycle', module: 'androidx-lifecycle-livedata'
        exclude group: 'androidx.lifecycle', module: 'androidx-lifecycle-livedata-core'
        exclude group: 'androidx.lifecycle', module: 'lifecycle-common'
        }

        implementation "androidx.activity:activity:${rootProject.ext.androidxActivity}"
        implementation "androidx.lifecycle:lifecycle-viewmodel:${rootProject.ext.androidxLifeCycle}"
        implementation "androidx.activity:activity:${rootProject.ext.androidxActivity}"
        implementation "androidx.fragment:fragment:${rootProject.ext.androidxFragmentVersion}"
        implementation "androidx.core:core:${rootProject.ext.androidxCoreVersion}"
        implementation "androidx.annotation:annotation:${rootProject.ext.annotationVersion}"

        implementation "androidx.arch.core:core-common:${rootProject.ext.androidxLifeCycle}"
        implementation "androidx.arch.core:core-runtime:${rootProject.ext.androidxLifeCycle}"
        implementation project(path: ':navigation-runtime')
        implementation project(path: ':navigation-common')
        implementation project(path: ':androidx-annotation')
        implementation project(path: ':androidx-collection')

        implementation project(path: ':navigation-ui')
        implementation project(path: ':navigation-fragment')
        implementation project(path: ':androidx-lifecycle-common')
        implementation project(path: ':androidx-lifecycle-livedata')
        implementation project(path: ':androidx-lifecycle-livedata-core')
        implementation project(path: ':androidx-annotation')