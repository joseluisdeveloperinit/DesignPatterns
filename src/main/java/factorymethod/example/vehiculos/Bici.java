package factorymethod.example.vehiculos;

public class Bici implements  Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("acelera Bici");

    }

    @Override
    public void frenar() {
        System.out.println("frena Bici");

    }
}
