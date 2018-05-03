package edu.programming.kotlin.ch03

abstract class Shape protected constructor() {
    var xLocation: Int = 0
        get() = field
        set(value: Int) {
            field = value
        }
    var yLocation: Int = 0
        get() = field
        set(value: Int) {
            field = value
        }
    var width: Double = 0.0
        get() = field
        set(value: Double) {
            field = value
        }
    var height: Double = 0.0
        get() = field
        set(value: Double) {
            field = value
        }

    abstract fun isHit(x: Int, y: Int): Boolean
}

class Ellipsis : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        val xRadius = width / 2
        val yRadius = height / 2
        val centerX = xLocation + xRadius
        val centerY = yLocation + yRadius

        if (xRadius == 0.0 || yRadius == 0.0)
            return false

        val normalizedX = centerX - xLocation
        val normalizedY = centerY - yLocation

        return (normalizedX * normalizedX) / (xRadius * xRadius) +
                (normalizedY * normalizedY) / (yRadius * yRadius) <= 1.0
    }
}

class Rectangle : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        return x >= xLocation && x <= (xLocation + width) &&
                y >= yLocation && y <= (yLocation + height)
    }
}

fun main(args: Array<String>) {
    println("Polymorphism")

    val e1 = Ellipsis()
    e1.height = 10.0
    e1.width = 12.0

    val e2 = Ellipsis()
    e2.xLocation = 100
    e2.yLocation = 96
    e2.height = 21.0
    e2.width = 19.0

    val r1 = Rectangle()
    r1.xLocation = 49
    r1.yLocation = 45
    r1.width = 10.0
    r1.height = 10.0

    val shapes = listOf(e1, e2, r1)
    val selected = shapes.firstOrNull {
        shape -> shape.isHit(50, 52)
    }
    if (selected == null) {
        println("There is no shape at point(50,52)")
    } else {
        println("A shape of type ${selected.javaClass.simpleName} has  been selected.")
    }

}
