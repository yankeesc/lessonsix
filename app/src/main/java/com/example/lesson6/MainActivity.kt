package com.example.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var clickButton3: Button
    private lateinit var messageTextView: TextView
    private lateinit var clickbutton2: Button
    private lateinit var clickrestart: Button
    private var clickCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        onClickButton()
    }

    private fun initViews() {
        clickbutton2 = findViewById(R.id.clickbutton2)
        clickButton3 = findViewById(R.id.clickbutton3)
        clickrestart = findViewById(R.id.clickrestart)
        messageTextView = findViewById(R.id.messageTextView)
    }

    private fun onClickButton() {
        clickrestart.setOnClickListener {
            recreate()
        }
        clickbutton2.setOnClickListener{
            clickCounter++
            if (clickCounter==1) {
                messageTextView.text = "Мне жаль.Тогда посмотрим урок еще раз?"}
            else if (clickCounter ==2){
                messageTextView.text = "удачи тебе!"

            }
        }
        clickButton3.setOnClickListener {
            clickCounter++
            if (clickCounter == 1) {
                messageTextView.text = "Я рад что все понятно. Продолжим?"
            } else if (clickCounter == 2) {
                messageTextView.text = "Ура!"
            }
        }
    }
}