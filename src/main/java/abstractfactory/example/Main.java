package abstractfactory.example;

import abstractfactory.example.interfaces.Chair;
import abstractfactory.example.interfaces.FurnitureFactory;
import abstractfactory.example.interfaces.Sofa;
import abstractfactory.example.interfaces.Table;
import abstractfactory.example.modernstyle.ModernFactory;

public class Main {
	
    public static void main(String[] args) {
        // Elegimos la fábrica en tiempo de ejecución (podría venir de configuración)
        FurnitureFactory factory = new ModernFactory(); // o new ClassicFactory()

        // Creamos los muebles usando la fábrica abstracta
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        Sofa sofa = factory.createSofa();
        

        // Usamos los muebles
        chair.sitOn();
        table.putOn();
        sofa.lieOn();
    }

}
