package com.example.bmiinkotlin_feb14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bmiValue = intent.getIntExtra("bmi", 0)

        if (bmiValue>25){
            bottom.text = resources.getString(R.string.over)
            bottom.setTextColor(resources.getColor(R.color.over))

        }else if(bmiValue<18){
            bottom.text = resources.getString(R.string.under)
            bottom.setTextColor(resources.getColor(R.color.under))

        }else {
            bottom.text = resources.getString(R.string.fit)
            bottom.setTextColor(resources.getColor(R.color.fit))
        }
    }
}