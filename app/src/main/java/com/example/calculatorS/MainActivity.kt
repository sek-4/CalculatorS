package com.example.calculatorS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Numb1: EditText = findViewById(R.id.Number1)
        val Numb2: EditText = findViewById(R.id.Number2)
        val Result: TextView = findViewById(R.id.Result)

        val btnSum: Button = findViewById(R.id.btnSum)
        val btnSub: Button = findViewById(R.id.btnSub)
        val btnDivide: Button = findViewById(R.id.btnDivide)
        val btnMult: Button = findViewById(R.id.btnMult)

        btnSum.setOnClickListener {
            val num1: Int = Integer.parseInt(Numb1.text.toString())
            val num2: Int = Integer.parseInt(Numb2.text.toString())
            val res = num1 + num2
            Result.text = res.toString()
        }
        btnSub.setOnClickListener {
            val num1: Int = Integer.parseInt(Numb1.text.toString())
            val num2: Int = Integer.parseInt(Numb2.text.toString())
            val res = num1 - num2
            Result.text = res.toString()
        }
        btnDivide.setOnClickListener {
            val num1: Int = Integer.parseInt(Numb1.text.toString())
            val num2: Int = Integer.parseInt(Numb2.text.toString())
            if (num2 > 0) {
                val res = num1 / num2
                Result.text = res.toString()

            } else {
                val res = "Cannot be calculated!"
                Result.text = res.toString()
            }
            btnMult.setOnClickListener {
                val num1: Int = Integer.parseInt(Numb1.text.toString())
                val num2: Int = Integer.parseInt(Numb2.text.toString())
                val res = num1 * num2
                Result.text = res.toString()
            }
        }
    }
}