package factorymethod.example;

import factorymethod.example.factoria.BiciFactoria;
import factorymethod.example.factoria.CocheFactoria;
import factorymethod.example.factoria.MotoFactoria;
import factorymethod.example.vehiculos.Vehiculo;

public class Main {

    public static void main(String[] args) {
//        BiciFactoria biciFactoria = new BiciFactoria();
//        CocheFactoria cocheFactoria = new CocheFactoria();
//        MotoFactoria motoFactoria = new MotoFactoria();
//
//
//        biciFactoria.crearVehiculo(); //solo crea
//        cocheFactoria.crearVehiculo();
//        motoFactoria.crearVehiculo();
//
//        biciFactoria.entregarVehiculo(); //crea y entrega a la vez, pero seria otro objeto distinto
//        cocheFactoria.entregarVehiculo();
//        motoFactoria.entregarVehiculo();


        BiciFactoria biciFactoria = new BiciFactoria();

        // 1. Crear y guardar el vehículo en una variable
        Vehiculo bici = biciFactoria.crearVehiculo();  // Se crea UNA vez
        System.out.println("Vehículo creado: " + bici.getClass().getSimpleName());

        // 2. Entregar el mismo vehículo (sin recrearlo)
        biciFactoria.entregarVehiculo();  // Usa el vehículo ya creado


    }
}
