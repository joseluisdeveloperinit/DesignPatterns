package abstractfactory.example.classicstyle;

import abstractfactory.example.interfaces.Sofa;

public class ClassicSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Recostado en un sofá clásico de tela.");
    }
}
