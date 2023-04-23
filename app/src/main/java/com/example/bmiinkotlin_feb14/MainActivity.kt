package com.example.bmiinkotlin_feb14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        health.setOnClickListener {
            if (heightIn.text.toString() != "" && heightFt.text.toString() != "" &&
                weight.text.toString() != ""
            ){

                val wt = (weight.text.toString()).toDouble()
                val hFt =  (heightFt.text.toString()).toDouble()
                val hIn  = (heightIn.text.toString()).toDouble()

                val totalInc = hFt*12 + hIn;
                val totalCm = totalInc*2.54;
                val totalM = totalCm/100;
                val bmi = wt/(totalM*totalM);

                top.text = resources.getString(R.string.bmi)
                val finalValue = bmi.toInt()

                val intent = Intent(this, result::class.java)
                intent.putExtra("bmi", finalValue)
                startActivity(intent)

            }else{
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_LONG).show()
            }
        }

    }
}