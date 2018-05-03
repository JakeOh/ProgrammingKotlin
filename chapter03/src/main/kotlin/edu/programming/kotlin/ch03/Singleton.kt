package edu.programming.kotlin.ch03

object Singleton {
    private var count = 0

    fun doSomething(): Unit {
        println("Calling a doSomething (${++count} call/-s in total)")
    }
}
