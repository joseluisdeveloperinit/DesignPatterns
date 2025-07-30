package abstractfactory.example.modernstyle;

import abstractfactory.example.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Recostado en un sofá moderno de cuero.");
    }
}