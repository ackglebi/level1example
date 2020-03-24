package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* activates checkAnswer() method when clicked */
        confirmButton.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val answer = questionInput.text.toString()
        var showMessage = getString(R.string.incorrect)


        if (answer == getString(R.string.giraffe)) {
            showMessage = getString(R.string.correct)
        } else {
            showMessage = getString(R.string.incorrect)
        }

        Toast.makeText(this, showMessage, Toast.LENGTH_LONG).show()
    }
}
