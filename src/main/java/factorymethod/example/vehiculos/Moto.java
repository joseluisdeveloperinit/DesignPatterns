package factorymethod.example.vehiculos;

public class Moto implements Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("acelera Moto");

    }

    @Override
    public void frenar() {
        System.out.println("frena Moto");

    }
}
