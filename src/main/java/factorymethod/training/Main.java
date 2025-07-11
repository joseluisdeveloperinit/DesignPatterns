package factorymethod.training;

import factorymethod.training.factory.CarFactory;
import factorymethod.training.factory.MotorBikeFactory;
import factorymethod.training.factory.BikeFactory;
import factorymethod.training.factory.FactoryVehicle;
import factorymethod.training.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Crear fábricas concretas
        FactoryVehicle fabricaCoches = new CarFactory();
        FactoryVehicle fabricaMotos = new MotorBikeFactory();
        FactoryVehicle fabricaBicicletas = new BikeFactory();

        // Usar el Factory Method para crear vehículos
        Vehicle coche = fabricaCoches.crearVehiculo();
        Vehicle moto = fabricaMotos.crearVehiculo();
        Vehicle bicicleta = fabricaBicicletas.crearVehiculo();

        // Probar los vehículos
        coche.acelerar();      // Output: "acelerando Coche"
        coche.frenar();        // Output: "frenando Coche"

        moto.acelerar();       // Output: "acelerando Moto"
        moto.frenar();         // Output: "frenando Moto"

        bicicleta.acelerar();  // Output: "acelerando Bicicleta"
        bicicleta.frenar();    // Output: "frenando Bicicleta"

        // Usar el método adicional de la fábrica abstracta
        System.out.println("\n--- Entregando vehículos ---");
        fabricaCoches.entregarVehiculo();  // Output: "Preparando vehículo..." + "acelerando Coche"
        fabricaMotos.entregarVehiculo();    // Output: "Preparando vehículo..." + "acelerando Moto"
    }
}