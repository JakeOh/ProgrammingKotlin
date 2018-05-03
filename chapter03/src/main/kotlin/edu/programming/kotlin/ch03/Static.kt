package edu.programming.kotlin.ch03

// define methods at the package level to achieve the functionality of static methods.
fun showFirstCharacter(input: String): Char {
    if (input.isEmpty()) throw IllegalArgumentException("Empty string")

    return input.first()
}
