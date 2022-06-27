package com.example.navigation.game

import android.util.Log
import androidx.lifecycle.ViewModel
//Make the GameViewModel class extend the abstract class ViewModel
class GameViewModel:ViewModel() {
    // The current word
    var word = ""

    // The current score
    var score = 0

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }
    fun onCorrect() {
        score++
        nextWord()
    }
    fun onSkip() {
        score--
        nextWord()
    }


    init {
        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()
    }
    /**
     * Callback called when the ViewModel is destroyed
     */
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
    fun nextWord(){
        if(!wordList.isEmpty()){
            word =wordList.removeAt(0)
        }

    }
}