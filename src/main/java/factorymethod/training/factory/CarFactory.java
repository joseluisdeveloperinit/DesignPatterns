package factorymethod.training.factory;

import factorymethod.training.vehicle.Car;
import factorymethod.training.vehicle.Vehicle;

public class CarFactory extends FactoryVehicle {
    @Override
    public Vehicle crearVehiculo() {
        return new Car();
    }
}