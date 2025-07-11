package factorymethod.training.vehicle;

public class MotorBike implements Vehicle {

    @Override
    public void acelerar() {
        System.out.println("acelerando Moto");
    }

    @Override
    public void frenar() {
        System.out.println("frenando Moto");

    }
}
