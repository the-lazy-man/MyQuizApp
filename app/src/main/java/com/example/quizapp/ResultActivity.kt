package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore:TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        val userName = intent.getStringExtra(MyConstants.USER_NAME)
        tvName.text = userName

        val totalQuestions = intent.getIntExtra(MyConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(MyConstants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions."

        btnFinish.setOnClickListener {
            //
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }
}