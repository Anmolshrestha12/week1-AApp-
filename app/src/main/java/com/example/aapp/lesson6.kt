package com.example.aapp

fun main (){
    fun show(a: Int, b: Int): Unit{
        println("you entered $a and $b")
    }
    fun add(a: Int, b: Int): Int {
        var sum = 0
        sum = a+b
        return sum
    }
    fun findMinimumNumber(a: Int, b: Int): Int{
        var minimum = 0
        if (a > b){
            minimum = b
        }else {
            minimum = a
        }
        return minimum
    }

    println("enter first number :")
    var a: Int = readln()!!.toInt()
    println("enter second number :")
    var b: Int = readln()!!.toInt()
    show(a,b)
    var sum = add(a,b)
    println("sum of the two entered number is $sum")
    var minimum = findMinimumNumber(a,b)
    println("add the smallest between $a nad $b is $minimum")
}