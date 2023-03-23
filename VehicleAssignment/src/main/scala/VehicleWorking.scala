package com.knoldus

class VehicleWorking(val vehicleType: String, val currentFuel: Int = 50) {

  // the maximum fuel capacity for the vehicle
  private val fuelCapacity: Int = 50

  // method to move the vehicle
  def move(): VehicleWorking = {
    if (currentFuel >= 20) {
      //if there is enough fuel the vehicle will move
      println(s"$vehicleType has enough fuel capacity of $currentFuel and will move")
      new VehicleWorking(vehicleType, currentFuel - 20)
    } else {

      // if there is not enough fuel, refuel the vehicle, and move again
      println(s"$vehicleType needs to be refueled first as fuel capacity of $currentFuel is only left")
      refuel().move()
      this
    }
  }

  // method to refuel the vehicle
  def refuel(): VehicleWorking = {
    new VehicleWorking(vehicleType, fuelCapacity)
  }
}
