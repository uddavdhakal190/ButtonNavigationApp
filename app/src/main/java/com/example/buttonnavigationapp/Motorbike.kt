package com.example.buttonnavigationapp

data class Motorbike(
    override val manufacturer: String,
    override val year: Int,
    override val country: String
) : Vehicle
