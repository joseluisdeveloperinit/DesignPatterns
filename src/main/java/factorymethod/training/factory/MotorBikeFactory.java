package factorymethod.training.factory;

import factorymethod.training.vehicle.MotorBike;
import factorymethod.training.vehicle.Vehicle;

// Fábrica de motos
public class MotorBikeFactory extends FactoryVehicle {
    @Override
    public Vehicle crearVehiculo() {
        return new MotorBike();
    }
}