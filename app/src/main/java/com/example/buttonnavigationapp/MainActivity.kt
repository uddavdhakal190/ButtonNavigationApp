package com.example.buttonnavigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carsButton = findViewById<Button>(R.id.button_cars)
        val motorbikesButton = findViewById<Button>(R.id.button_motorbikes)

        carsButton.setOnClickListener {
            openSecondActivity("Cars")
        }

        motorbikesButton.setOnClickListener {
            openSecondActivity("Motorbikes")
        }
    }

    private fun openSecondActivity(choice: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("CHOICE", choice)
        startActivity(intent)
    }
}

