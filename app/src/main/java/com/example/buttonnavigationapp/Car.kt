package com.example.buttonnavigationapp

data class Car(
    override val manufacturer: String,
    override val year: Int,
    override val country: String
) : Vehicle
