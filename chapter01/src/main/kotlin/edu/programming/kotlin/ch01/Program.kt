package edu.programming.kotlin.ch01

fun main(args: Array<String>) {
    println("Hello Kotlin!")

    val student = Student("Jake Oh")
    println("Student: ${student.name}")

    val carManufacturer = CarManufacturer("Mercedes")
    println("Car Manufactureer: ${carManufacturer.name}")
}