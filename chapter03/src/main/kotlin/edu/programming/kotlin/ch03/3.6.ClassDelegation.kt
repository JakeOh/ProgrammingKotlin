package edu.programming.kotlin.ch03

interface UIElement {
    fun getHeight(): Int
    fun getWidth(): Int
}

class MyRectangle(val x1: Int, val x2: Int, val y1: Int, val y2: Int) : UIElement {
    override fun getHeight() = y2 - y1
    override fun getWidth() = x2 - x1
}

class Panel(val rectangle: MyRectangle) : UIElement by rectangle

fun main(args: Array<String>) {
    println("Class delegation")

    val panel = Panel(MyRectangle(10, 30, 10, 100))
    println("panel height: ${panel.getHeight()}")
    println("panel width: ${panel.getWidth()}")

}
