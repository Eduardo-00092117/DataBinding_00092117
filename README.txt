apply plugin: "kotlin-kapt"

dataBinding {
        enabled true
    }

//ViewModel y LiveData, DataBinding
implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0'
    kapt 'com.android.databinding:compiler:3.4.0'

kapt { generateStubs = true }