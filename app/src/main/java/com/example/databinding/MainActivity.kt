package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewModel : ScoreViewModel
    var date = ScoreData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.scoreTeam = date
        date.scoreTeamA = viewModel.scoreTeamA.toString()
        date.scoreTeamB = viewModel.scoreTeamB.toString()
    }

    fun functionButton(v : View){
        if (btn_1punto_A == v){
            ++viewModel.scoreTeamA
        } else if (btn_2puntos_A == v){
            viewModel.scoreTeamA += 2
        } else if (btn_3puntos_A == v){
            viewModel.scoreTeamA += 3
        } else if (btn_1punto_B == v){
            ++viewModel.scoreTeamB
        } else if (btn_2puntos_B == v){
            viewModel.scoreTeamB += 2
        } else if (btn_3puntos_B == v){
            viewModel.scoreTeamB += 3
        } else if (btn_reset == v){
            viewModel.scoreTeamA = 0
            viewModel.scoreTeamB = 0
        }
        date.scoreTeamA = viewModel.scoreTeamA.toString()
        date.scoreTeamB = viewModel.scoreTeamB.toString()
    }
}
