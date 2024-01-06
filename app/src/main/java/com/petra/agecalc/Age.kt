package com.petra.agecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Age : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        val age = intent.getIntExtra("AGE", 0)

        val textViewAge:TextView = findViewById(R.id.textViewAge)
        textViewAge.text = "Your age is: $age"


    }
}