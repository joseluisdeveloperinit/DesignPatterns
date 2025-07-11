package factorymethod.example.factoria;

import factorymethod.example.vehiculos.Vehiculo;

public abstract class Factoria {

    public abstract Vehiculo crearVehiculo();

    public void entregarVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        System.out.println("Preparando vehículo...");
        vehiculo.acelerar();
    }
}
