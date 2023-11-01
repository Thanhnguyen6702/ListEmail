package com.example.email;

class email {
    private var name: String =""
    private var letter: String =""
    private var hour: String=""

    constructor(name: String, letter: String, hour: String) {
        this.name = name
        this.letter = letter
        this.hour = hour
    }

    fun getName(): String{
        return  name
    }
    fun getLetter(): String{
        return  letter
    }
    fun  getHour(): String{
        return hour
    }

}
