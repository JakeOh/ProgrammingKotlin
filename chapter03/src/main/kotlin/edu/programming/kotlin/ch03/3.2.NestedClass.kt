package edu.programming.kotlin.ch03

class BasicGraph(val name: String) {
    // Nested class
    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing a line from ($x1, $y1) to ($x2, $y2).")
        }
    }

    fun draw(): Unit {
        println("Drawing the graph $name.")
    }
}

class BasicGraphWithInner(graphName: String) {
    private val name: String

    init {
        name = graphName
    }

    inner class InnerLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing a line from ($x1, $y1) to ($x2, $y2) for $name.")
        }
    }

    fun draw(): Unit {
        println("Drawing the graph $name.")
    }
}

class A {
    private val someField: Int = 1
    inner class B {
        private val someField: Int = 2

        fun foo() {
            println("this someFiled: ${this.someField}")
            println("this@B someField: ${this@B.someField}")
            println("this@A someFiled: ${this@A.someField}")
        }
    }
}

fun main(args: Array<String>) {
    println("Nested Class")

    val line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()

    val line2 = BasicGraphWithInner("Simple Line").InnerLine(1, 1, 2, 3)
    line2.draw()

    val foo = A().B()
    foo.foo()
}