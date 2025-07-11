package factorymethod.training.factory;

import factorymethod.training.vehicle.Bike;
import factorymethod.training.vehicle.Vehicle;

// Fábrica de bicicletas
public class BikeFactory extends FactoryVehicle {
    @Override
    public Vehicle crearVehiculo() {
        System.out.println("se creo una bici desde la bicifactoria");
        return new Bike();
    }
}