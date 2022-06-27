package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.navigation.databinding.ActivityPrintNumberIncludingInputBinding
import java.util.*

class PrintNumberIncludingInput : AppCompatActivity() {
    lateinit var binding: ActivityPrintNumberIncludingInputBinding
    lateinit var txtInput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_number_including_input)
        binding=ActivityPrintNumberIncludingInputBinding.inflate(layoutInflater)
        txtInput=findViewById(R.id.et_number)



        binding.btn.setOnClickListener {
            val inputNumber=txtInput.toString().toInt()
            if (inputNumber<0 && inputNumber>100){

            } else{
                for (i in inputNumber..(inputNumber + 10)){

                }

            }


        }





//     for (i in 1..100){
//        var inputNumber=binding.etNumber.text.toString()
//
//     }
    }

}