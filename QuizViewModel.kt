package com.bignerdranch.android.geoquiz

import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {

    var currentIndex = 0
    var isCheater = false

    private val questionBank = listOf(
            Question(R.string.question_southamerica, false),
            Question(R.string.question_oceans, true),
            Question(R.string.question_canada, true),
            Question(R.string.question_aftrica, false),
            Question(R.string.question_americas, true),
            Question(R.string.question_arizona, true),
            Question(R.string.question_continent, false),
            Question(R.string.question_unitedstates, true),
            Question(R.string.question_california, true)

    )


    val currentQuestionAnswer: Boolean
            get() = questionBank[currentIndex].answer
    val currentQuestionText: Int
            get() = questionBank[currentIndex].textResId
    fun moveToNext() {
            currentIndex = (currentIndex + 1) % questionBank.size
    }


}