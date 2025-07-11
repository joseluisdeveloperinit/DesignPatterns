package factorymethod.example.factoria;

import factorymethod.example.vehiculos.Coche;
import factorymethod.example.vehiculos.Vehiculo;

public class CocheFactoria  extends Factoria {
    @Override
    public Vehiculo crearVehiculo() {
        return new Coche();
    }
}
