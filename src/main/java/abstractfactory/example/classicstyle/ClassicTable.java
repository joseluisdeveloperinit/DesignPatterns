package abstractfactory.example.classicstyle;

import abstractfactory.example.interfaces.Table;

public class ClassicTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Colocando objetos en una mesa clásica de roble.");
    }
}