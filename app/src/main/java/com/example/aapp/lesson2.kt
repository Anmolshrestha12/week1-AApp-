package com.example.aapp

import java.util.ArrayList

fun main(args: Array<String>){
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element od age is ${age[0]}")
    println("The second element of age is ${age[1]}")
    println("The third element of age is ${age[2]}")

    println("******************************")

    var name = arrayOf("ram","shyam","hari")
    name[1] = "sandis"
    println("The first element  of name is ${name[0]}")
    println("The second element  of name is ${name[1]}")
    println("The third element  of name is ${name[2]}")

    println(name.size)


    println("************************************")

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var names = arrayListOf<String>("ram","joshna","anish")
    names.add("anmol")
    names.add(4,"hari")

    names.remove("anish")
    names.removeAt(0)

    println(names)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])



}