package com.example.quizapp

data class Question(
    val Id : Int,
    val quizQuestion : String,
    val image : Int,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctAnswer : Int
)
