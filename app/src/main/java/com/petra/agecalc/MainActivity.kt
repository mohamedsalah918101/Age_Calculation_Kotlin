package com.petra.agecalc

import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonCalculateAge: Button = findViewById(R.id.buttonCalculateAge)


        buttonCalculateAge.setOnClickListener()
        {
            val yearOfBirthStr: EditText = findViewById(R.id.editTextYear)
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            if (yearOfBirthStr.text.isNotEmpty() && yearOfBirthStr.text.toString().toInt() <= year) {
                val yearOfBirth = yearOfBirthStr.text.toString().toInt()
                val age = year - yearOfBirth

                val intent = Intent(this@MainActivity, Age::class.java)
                intent.putExtra("AGE", age)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity,"Enter a valid year",Toast.LENGTH_SHORT).show()
            }
        }
    }
}