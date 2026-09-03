package com.example.petshop

class Happy(date: String) : Mood(date){
    override fun name(): String {
        return "happy on $date"
    }

}