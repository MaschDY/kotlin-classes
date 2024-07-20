package br.com.maschdy.kotlinclasses

fun main() {
    val vehicle = Vehicle(model = "Chevrolet Corsa", acceleration = 10)

    vehicle.incrementVelocity()
    printVehicleInfo(vehicle)

    vehicle.decrementVelocity()
    printVehicleInfo(vehicle)

    vehicle.incrementVelocity()
    vehicle.incrementVelocity()
    vehicle.incrementVelocity()
    printVehicleInfo(vehicle)

    vehicle.decrementVelocity()
    vehicle.decrementVelocity()
    vehicle.decrementVelocity()
    vehicle.decrementVelocity()
    vehicle.decrementVelocity()
    printVehicleInfo(vehicle)
}

private fun printVehicleInfo(vehicle: Vehicle) {
    println("O Veículo ${vehicle.model} tem a velocidade de: ${vehicle.actualVelocity()} Km/H")
}
