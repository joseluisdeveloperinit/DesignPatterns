package factorymethod.example.vehiculos;

public class Coche implements Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("acelera coche");
    }

    @Override
    public void frenar() {
        System.out.println("frena coche");
    }
}
