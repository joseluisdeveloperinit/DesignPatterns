package factorymethod.example.factoria;

import factorymethod.example.vehiculos.Moto;
import factorymethod.example.vehiculos.Vehiculo;

public class MotoFactoria  extends Factoria {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
