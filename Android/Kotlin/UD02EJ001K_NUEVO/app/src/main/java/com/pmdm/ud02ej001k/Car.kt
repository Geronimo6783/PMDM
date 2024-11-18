package com.pmdm.ud02ej001k

/**
 * A road vehicle with an engine and four wheels.
 * @author Bill Gates
 * @since 1.3.4
 * @constructor Creates a new car class with the given brand name.
 * @property brand The brand of the car as a String.
 */
class Car(
    private val brand: String
) {
    /**
     * Starts the car and prints the distance it will travel.
     * @param distance The distance to drive in kilometers.
     * @see addPassenger Consider adding a passenger before calling this function.
     */
    fun drive(distance: Int) {
        println("Drive $distance km with a $brand car...")
    }

    /**
     * Adds a passenger to the car.
     * @param name The name of the passenger.
     */
    fun addPassenger(name: String) {
        println("$name is now in the $brand car")
    }
}