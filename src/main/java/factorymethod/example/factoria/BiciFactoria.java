package factorymethod.example.factoria;

import factorymethod.example.vehiculos.Bici;
import factorymethod.example.vehiculos.Vehiculo;

public class BiciFactoria extends Factoria {
    @Override
    public Vehiculo crearVehiculo() {
        System.out.println("bici creada desde la factoria de bicis x");
        return new Bici();
    }
}
