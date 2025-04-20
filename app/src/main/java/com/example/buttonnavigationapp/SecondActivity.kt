package com.example.buttonnavigationapp

import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val choice = intent.getStringExtra("CHOICE")

        val textView = findViewById<TextView>(R.id.textView_choice)
        val listView = findViewById<ListView>(R.id.listView_items)

        textView.text = choice

        val vehicleList: List<Vehicle> = if (choice == "Cars") {
            listOf(
                Car("Toyota", 1937, "Japan"),
                Car("Ford", 1903, "USA"),
                Car("BMW", 1916, "Germany"),
                Car("Hyundai", 1967, "South Korea"),
                Car("Volvo", 1927, "Sweden")
            )
        } else {
            listOf(
                Motorbike("Harley-Davidson", 1903, "USA"),
                Motorbike("Ducati", 1926, "Italy"),
                Motorbike("Kawasaki", 1896, "Japan"),
                Motorbike("Royal Enfield", 1901, "UK/India"),
                Motorbike("Yamaha", 1955, "Japan")
            )
        }

        val adapter = VehicleAdapter(this, vehicleList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, _, position, _ ->
            val selectedVehicle = parent.getItemAtPosition(position) as Vehicle
            val message = "The manufacturer of this ${choice?.lowercase()} is ${selectedVehicle.manufacturer} " +
                    "and it was built in year ${selectedVehicle.year} in ${selectedVehicle.country}"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
