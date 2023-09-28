package com.example.calculadora_mobile

import android.widget.ImageButton
import android.widget.TextView

class Screen(private val tvResult: TextView) {

    private var resultValue: String = "0"
    fun displayNumberOnClick(button: ImageButton) {
        if (resultValue == "0") {
            resultValue = button.tag.toString()
            updateScreen()
        } else {
            resultValue += button.tag.toString()
            updateScreen()
        }
    }

    private fun updateScreen() {
        tvResult.text = resultValue
    }

    fun eraseLastNumber() {
        if (resultValue != "0") {
            resultValue = resultValue.dropLast(1)
        }
        updateScreen()
    }

    fun eraseAllNumbers() {
        resultValue = "0"
        updateScreen()
    }

    fun addComma() {
        if (!resultValue.contains(".") && resultValue != "0") {
            resultValue += "."
        }
        updateScreen()
    }
}