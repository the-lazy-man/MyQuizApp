package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val btnStart : TextView = findViewById(R.id.btn_start)
        val edtName : EditText = findViewById(R.id.edt_name)
        btnStart.setOnClickListener(View.OnClickListener {
                if(edtName.text.isEmpty())
                    Toast.makeText(this,"Enter your name",Toast.LENGTH_SHORT).show()
                else{
                    val intent = Intent(this, QuizQuestions::class.java)
                    intent.putExtra(MyConstants.USER_NAME, edtName.text.toString())
                    startActivity(intent)
                }
        })
    }
}