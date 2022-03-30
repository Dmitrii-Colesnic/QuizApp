package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Congratulations : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations)

        val tvCorrectAnswer: TextView = findViewById(R.id.tv_correctAnswers)
        findViewById<Button>(R.id.btn_tryAgain).setOnClickListener(this)
        findViewById<Button>(R.id.btn_close).setOnClickListener(this)

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvCorrectAnswer.text = "Your score is $correctAnswers out of $totalQuestions"

    }

    override fun onClick(view: View?){
        when(view?.id){
            R.id.btn_close -> {
                this.finish()
            }
            R.id.btn_tryAgain -> {
                startActivity( Intent(this, MainActivity::class.java) )
                finish()
            }
        }
    }

}
