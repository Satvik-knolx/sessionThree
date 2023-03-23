import com.knoldus.VehicleWorking
import org.scalatest.funsuite.AnyFunSuite

class VehicleWorkingTest extends AnyFunSuite {

  test("Bike should move two times") {
    val bike = new VehicleWorking("Bike")
    assert(bike.move().move().currentFuel == 10)
  }

  test("Bike should move three times while refueling") {
    val bike = new VehicleWorking("Bike")
    assert(bike.move().move().move().currentFuel == 10)
  }

  test("Car should move two times") {
    val car = new VehicleWorking("Car")
    assert(car.move().move().currentFuel == 10)
  }

  test("Car should move three times while refueling") {
    val car = new VehicleWorking("Car")
    assert(car.move().move().move().currentFuel == 10)
  }

  test("Truck should move two and three times") {
    val truck = new VehicleWorking("Truck")
    assert(truck.move().move().currentFuel == 10)
  }

  test("Truck should move three times while refueling") {
    val truck = new VehicleWorking("Truck")
    assert(truck.move().move().move().currentFuel == 10)
  }

}
