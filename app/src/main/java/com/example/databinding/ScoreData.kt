package com.example.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ScoreData : BaseObservable(){

    @get:Bindable
    var scoreTeamA: String = "0"
        set(value) {
            field = value
            notifyPropertyChanged(BR.scoreTeamA)
        }

    @get:Bindable
    var scoreTeamB: String = "0"
        set(value) {
            field = value
            notifyPropertyChanged(BR.scoreTeamB)
        }
}