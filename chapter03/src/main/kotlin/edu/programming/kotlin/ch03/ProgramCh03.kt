package edu.programming.kotlin.ch03

class Person constructor(val firstName: String, val lastName: String, val age: Int?) {
    // init block
    init {
        require(firstName.trim().length > 0) {
            "Invalid firstName argument."
        }
        require(lastName.trim().isNotEmpty()) {
            "Invalid lastName argument."
        }
        if (age != null) {
            require(age in 0..200) {
                "Invalid age argument."
            }
        }
    }

    // secondary constructor
    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}

class Person2(firstName: String, lastName: String, age: Int?) {
    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName $lastName"
        this.age = age
    }

    fun getName(): String = this.name
    fun getAge(): Int? = this.age
}

fun main(args: Array<String>) {
    println("Chapter 3. Class")

    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith")
    println("${person1.firstName} ${person1.lastName} is " +
            "${person1.age?.toString() ?: "?"} years old")
    println("${person2.firstName} ${person2.lastName} is " +
            "${person2.age ?: "?"} years old")

//    val person3 = Person("John", "Smith", -1)

    val person3 = Person2("Paul", "Smith", 19)
    println("${person3.getName()} is ${person3.getAge() ?: "?"} years old")

}
