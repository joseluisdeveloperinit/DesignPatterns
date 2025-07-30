
package abstractfactory.example.modernstyle;

import abstractfactory.example.interfaces.Table;

public class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Colocando objetos en una mesa moderna de vidrio.");
    }
}