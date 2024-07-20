package br.com.maschdy.kotlinclasses

class Vehicle(val model: String, val acceleration: Long) {
    private var velocity: Long = 0

    fun incrementVelocity() {
        velocity += acceleration
    }

    fun decrementVelocity() {
        velocity = if (velocity >= acceleration) {
            velocity - acceleration
        } else {
            0
        }
    }

    fun actualVelocity(): Long {
        return velocity
    }
}
