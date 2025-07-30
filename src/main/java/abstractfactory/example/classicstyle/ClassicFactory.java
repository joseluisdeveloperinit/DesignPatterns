package abstractfactory.example.classicstyle;

import abstractfactory.example.interfaces.Chair;
import abstractfactory.example.interfaces.FurnitureFactory;
import abstractfactory.example.interfaces.Sofa;
import abstractfactory.example.interfaces.Table;

public class ClassicFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

	@Override
	public Chair createChair(String material, String color, double price) {
		return  new ClassicChair(material,color, price);
	}
}