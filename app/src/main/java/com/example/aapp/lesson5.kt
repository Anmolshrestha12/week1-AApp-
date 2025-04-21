package com.example.aapp

import kotlin.random.Random

fun main (){
    //if else statement
    print("please enter a number: ")
    var number: Any= readln()!!.toInt()
    if(number.toString().toInt()%2==0){
        println("$number is even")
    }else{
        println("$number is odd")
    }

    println("********************")

    //if else if ladder statement

    print("please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if(yourAge < 13){
        print("you are a child")
    }else if (yourAge < 19) {
        print("you are a teenager")
    }else {
        if (yourAge < 50) {
            print("you are an adult")
        }else{
            print("you are a senior")
        }
    }

    println("************************")

    //nested if statement

    println("please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if(number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if (number2 >= number3){
            largestNumber = number2
        }else{
            largestNumber = number3
        }
    }
    println("the largest number is $largestNumber")

    println("***********************")

    //when statement

    print("please enter a day number of week : -")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when(dayNumber){
        1 -> day = "sunday"
        2 -> day = "monday"
        3 -> day = "tuesday"
        4 -> day = "wednesday"
        5 -> day = "thursday"
        6 -> day = "friday"
        7 -> day = "saturday"
        else -> day = "Invalid day choice"
    }
    println(day)

    println("************************")

    //for loop
    for (i in 1 ..  9){
        println(i)
    }
    var sum:Int = 0
    for(x in 0 .. 5){
        println(x)
        sum +=x
    }

    println("***********************")

    //for each loop

    var vehicle = arrayListOf<String>("tata","kia","mg")
    vehicle.forEach {
        println(it)
    }

    println("***********************")

    //while loop

    var i:Int=0
    while (i<5){
        println(i)
        i++
    }

    println("*********************")

    //infinite loop

    var numberr = Random.nextInt(0, 10000)
    println("please enter any number from 0 to 10000: -")
    while (2>1){
        var userGuess: Int = readln()!!.toInt()
        if(userGuess == numberr){
            println("congratulation!!!!, you won")
            break
        }else if (userGuess<numberr){
            println("increase your guess")
        }else{
            println("decrease your guess")
        }
    }

    println("*************************")

    //do while loop

    var nuumber = 1
    do {
        println(nuumber)
        nuumber++
    }while (nuumber <= 15)
}