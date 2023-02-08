package com.example.dumiaslcalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_clear : Button = findViewById(R.id.button_Clear)
        button_Clear.setOnClickListener {

            input.text = addToInputText("(")

        }
//        val btn_clear : Button = findViewById(R.id.button_Clear)
//
//        button_bracket_r.setOnClickListener {
//
//            input.text = addToInputText(")")
//
//        }


    }
}