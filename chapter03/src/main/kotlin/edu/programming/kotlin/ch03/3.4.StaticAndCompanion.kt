package edu.programming.kotlin.ch03

fun main(args: Array<String>) {
    println("Static methods and companion objects")

    println(showFirstCharacter("Hello Kotlin!"))

    Singleton.doSomething()
    Singleton.doSomething()
}
