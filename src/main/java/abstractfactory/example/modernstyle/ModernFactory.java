package abstractfactory.example.modernstyle;

import abstractfactory.example.interfaces.Chair;
import abstractfactory.example.interfaces.FurnitureFactory;
import abstractfactory.example.interfaces.Sofa;
import abstractfactory.example.interfaces.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair(null, null, 0);
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

	@Override
	public Chair createChair(String material, String color,double price) {
		return new ModernChair(material,color,price);
	}
	
	
	
}