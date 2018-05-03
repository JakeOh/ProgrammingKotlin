package edu.programming.kotlin.ch03

object Singleton {
    private var count = 0

    fun doSomething(): Unit {
        println("Calling a doSomething (${++count} call/-s in total)")
    }
}

open class SingletonParent(var x: Int) {
    fun doSomething(): Unit {
        println("x = $x")
    }
}

object SingletonDerived: SingletonParent(10)
