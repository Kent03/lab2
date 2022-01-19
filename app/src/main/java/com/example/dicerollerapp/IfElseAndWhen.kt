package com.example.dicerollerapp

fun main() {
    var xucSac = XucSac(6).roll()
    val luckyNumber = 4
    when(xucSac){
        luckyNumber -> print("Oke hay")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
        else -> print("oke no!!!!!!")
    }
}

class XucSac(val sides: Int){
    fun roll() : Int{
        return (1..sides).random()
    }
}