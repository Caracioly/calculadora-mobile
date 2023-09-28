package com.example.calculadora_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screen = Screen(findViewById(R.id.tvResult))

        val btn0 = findViewById<ImageButton>(R.id.btn0)
        btn0.tag = "0"
        val btn1 = findViewById<ImageButton>(R.id.btn1)
        btn1.tag = "1"
        val btn2 = findViewById<ImageButton>(R.id.btn2)
        btn2.tag = "2"
        val btn3 = findViewById<ImageButton>(R.id.btn3)
        btn3.tag = "3"
        val btn4 = findViewById<ImageButton>(R.id.btn4)
        btn4.tag = "4"
        val btn5 = findViewById<ImageButton>(R.id.btn5)
        btn5.tag = "5"
        val btn6 = findViewById<ImageButton>(R.id.btn6)
        btn6.tag = "6"
        val btn7 = findViewById<ImageButton>(R.id.btn7)
        btn7.tag = "7"
        val btn8 = findViewById<ImageButton>(R.id.btn8)
        btn8.tag = "8"
        val btn9 = findViewById<ImageButton>(R.id.btn9)
        btn9.tag = "9"

        val btnTimes = findViewById<ImageButton>(R.id.btntimes)
        val btnDivision = findViewById<ImageButton>(R.id.btndivision)
        val btnPlus = findViewById<ImageButton>(R.id.btnplus)
        val btnMinus = findViewById<ImageButton>(R.id.btnminus)
        val btnBackSpace = findViewById<ImageButton>(R.id.btnBackspace)
        val btnPercentage = findViewById<ImageButton>(R.id.btnpercentage)
        val btnEqual = findViewById<ImageButton>(R.id.btnequal)
        val btnComma = findViewById<ImageButton>(R.id.btncomma)
        val btnClear = findViewById<ImageButton>(R.id.btnClear)

        btn0.setOnClickListener { screen.displayNumberOnClick(btn0) }
        btn1.setOnClickListener { screen.displayNumberOnClick(btn1) }
        btn2.setOnClickListener { screen.displayNumberOnClick(btn2) }
        btn3.setOnClickListener { screen.displayNumberOnClick(btn3) }
        btn4.setOnClickListener { screen.displayNumberOnClick(btn4) }
        btn5.setOnClickListener { screen.displayNumberOnClick(btn5) }
        btn6.setOnClickListener { screen.displayNumberOnClick(btn6) }
        btn7.setOnClickListener { screen.displayNumberOnClick(btn7) }
        btn8.setOnClickListener { screen.displayNumberOnClick(btn8) }
        btn9.setOnClickListener { screen.displayNumberOnClick(btn9) }

        btnBackSpace.setOnClickListener { screen.eraseLastNumber() }
        btnBackSpace.setOnLongClickListener {
            screen.eraseAllNumbers()
            true
        }

        btnClear.setOnClickListener { screen.eraseAllNumbers() }

        btnComma.setOnClickListener { screen.addComma()}

    }
}