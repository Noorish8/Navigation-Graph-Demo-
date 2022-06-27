package com.example.navigation.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.navigation.R
import com.example.navigation.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {
  lateinit var binding: FragmentScoreBinding
  lateinit var viewModel: ScoreViewModel
  lateinit var viewModelFactory: ScoreViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     return inflater.inflate(R.layout.fragment_score, container, false)
//        val binding: ScoreFragmentBinding = DataBindingUtil.inflate(
//            inflater,
//            R.layout.score_fragment,
//            container,
//            false
       // binding=FragmentScoreBinding.inflate(inflater)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        var ScoreFragmentArgs = arguments
//        viewModelFactory = ScoreViewModelFactory(ScoreFragmentArgs.fromBundle(requireArguments()).score)
//        viewModel = ViewModelProvider(this, viewModelFactory)
//            .get(ScoreViewModel::class.java)

        binding.scoreText.text = viewModel.score.toString()
    }



}