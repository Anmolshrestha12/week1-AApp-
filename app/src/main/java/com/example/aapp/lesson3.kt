package com.example.aapp

fun main(){
    val lst = listOf("one","two","three")
    println("Mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
    println()
    val mutableLst = mutableListOf("one","two","three")
    mutableLst.add("four")
    println("immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }

    println("***********************************")

    val numbers = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }

    println("***********************************")

    val countriesCapitals = mapOf(
        "nepal" to "kathmandu",
        "china" to "beijing",
        "india" to "new delhi"

    )
    println("all keys: ${countriesCapitals.keys}")
    println("all values: ${countriesCapitals.values}")

    println("capital of nepal is: ${countriesCapitals["nepal"]}")

    println("**********************************")

    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
    )
    println("enter student name: ")
    val input : String = readln().lowercase()
    println(studentMarks[input])

    println("********************************")

    val studentMarkss = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "gita" to 45,
    )

    studentMarkss["ram"] = 60
    studentMarkss.put("sabin",80)
    println("enter student name: ")
    val iinput : String = readln().lowercase()
    println(studentMarkss[iinput])
}