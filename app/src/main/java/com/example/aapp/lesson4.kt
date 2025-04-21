package com.example.aapp

import android.util.Printer

fun main(){
    //Arithmetic operator
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    println("****************************")

    //Assignment Operator

    var X:Int = 20
    var Y:Int = 10
    var Z:Int = 0

    Z = X+Y
    println("Z = X + Y = $Z")
    Z += X
    println("Z += X = $Z")
    Z -= X
    println("Z -= X = $Z")
    Z *= X
    println("Z *= X = $Z")
    Z /= X
    println("Z /= X = $Z")
    Z %= X
    println("Z %= X = $Z")

    println("****************************")

    // unary operator

    var number: Double = 7.6
    var isCheck: Boolean = true;
    println("+number = ${+number}")
    println("+number = ${-number}")
    println("+number = ${++number}")
    println("+number = ${--number}")
    println("+number = ${!isCheck}")
    println("-------------------------")
    var resultt:Double  = 4.7
    println("result : $result")
    println("result++ :" + result++)

    println("*************************")

    //equality and relational operators

    var a:Int = 5
    var b:Int = 5

    println("a == b : " + (a == b))
    println("a != b : " + (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a > b))
    println("a >= b : " + (a >= b))
    println("a <= b : " + (a <= b))

    println("*************************")

    // conditional operator

    var number1:Int = 5
    var number2:Int = 8
    var number3:Int = 12
    var resulttt: Boolean = false

    resulttt = (number1 > number2) && (number3 > number2)
    println(resulttt)
    resulttt = (number1 > number2) && (number3 > number2)
    println(resulttt)

println("****************************")


}