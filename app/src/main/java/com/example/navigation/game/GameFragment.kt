package com.example.navigation.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R
import com.example.navigation.databinding.FragmentGame2Binding

/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

 private lateinit var binding:FragmentGame2Binding
 private lateinit var viewModel:GameViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_game2, container, false)
        binding=FragmentGame2Binding.inflate(inflater)

        // Get the viewModel
        viewModel =ViewModelProvider(this).get(GameViewModel::class.java)
        binding.correctButton.setOnClickListener { onCorrect() }
        binding.skipButton.setOnClickListener { onSKip() }
        binding.endGameButton.setOnClickListener { onEndgame() }
        return binding.root
    }
    private fun onEndgame(){
        gameFinished()
    }
    private fun gameFinished(){

    }

    private fun onCorrect(){
        viewModel.onCorrect()
        updateWordText()
        updateScoreText()
    }
    private fun updateWordText() {
        binding.wordText.text = viewModel.word

    }
    private fun onSKip(){
        viewModel.onSkip()
        updateScoreText()
        updateScoreText()
    }
    private fun updateScoreText() {
        binding.scoreText.text = viewModel.score.toString()
    }




}
