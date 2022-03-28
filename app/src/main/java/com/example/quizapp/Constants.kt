package com.example.quizapp

import java.util.ArrayList

object Constants {

    fun getQuestions(): ArrayList<Question>{
        var questions = ArrayList<Question>()

        val question1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_moldova,
            "Moldova","Russia",
            "Ukraine","Turkey",0
        )
        val question2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_russia,
            "Moldova","Russia",
            "Ukraine","Turkey",1
        )
        val question3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_ukraine,
            "Moldova","Russia",
            "Ukraine","Turkey",2
        )

        questions.add(question1)
        questions.add(question2)
        questions.add(question3)

        return questions
    }
}