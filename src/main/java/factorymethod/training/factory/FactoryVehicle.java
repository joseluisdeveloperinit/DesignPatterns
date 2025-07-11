package factorymethod.training.factory;

import factorymethod.training.vehicle.Vehicle;

public abstract class FactoryVehicle {
    // Método factory (abstracto)
    public abstract Vehicle crearVehiculo();

    // Método de uso general (opcional)
    public void entregarVehiculo() {
        Vehicle vehicle = crearVehiculo();
        System.out.println("Preparando vehículo...");
        vehicle.acelerar();
    }
}