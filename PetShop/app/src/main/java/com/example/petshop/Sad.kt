package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun name(): String {
        return "sad on $date"
    }
}