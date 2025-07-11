package factorymethod.training.vehicle;

public class Bike implements Vehicle {
    @Override
    public void acelerar() {
        System.out.println("acelerando Bicicleta");
    }

    @Override
    public void frenar() {
        System.out.println("frenando Bicicleta");

    }
}
