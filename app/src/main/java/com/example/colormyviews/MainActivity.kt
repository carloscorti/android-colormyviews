package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            boxOneText.setOnClickListener { makeColored(it) }
            boxTwoText.setOnClickListener { makeColored(it) }
            boxThreeText.setOnClickListener { makeColored(it) }
            boxFourText.setOnClickListener { makeColored(it) }
            boxFiveText.setOnClickListener { makeColored(it) }
        }


    }

    private fun makeColored(view: View) {
        binding.apply {
            when (view) {

                // Boxes using Color class colors for background
                boxOneText -> view.setBackgroundColor(Color.DKGRAY)
                boxTwoText-> view.setBackgroundColor(Color.BLUE)

                // Boxes using Android color resources for background
                boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
                boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
                boxFiveText -> view.setBackgroundResource(android.R.color.holo_red_dark)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }

        }
    }


}