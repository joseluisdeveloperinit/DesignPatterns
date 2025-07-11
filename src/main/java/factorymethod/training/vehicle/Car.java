package factorymethod.training.vehicle;

public class Car implements Vehicle {
    @Override
    public void acelerar() {
        System.out.println("acelerando Coche");
    }

    @Override
    public void frenar() {
        System.out.println("frenando Coche");

    }
}
