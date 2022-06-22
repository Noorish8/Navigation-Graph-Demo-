package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     //lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding=ActivityMainBinding.inflate(layoutInflater)

       showFragment(LoginFragment())
    }

    fun showFragment( fragment:LoginFragment) {
        val frame =supportFragmentManager.beginTransaction()
        frame.replace(R.id.fragment_container_view_tag, fragment)
        frame.commit()
    }
}