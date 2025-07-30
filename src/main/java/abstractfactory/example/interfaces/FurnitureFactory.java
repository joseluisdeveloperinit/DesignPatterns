package abstractfactory.example.interfaces;

public interface  FurnitureFactory {
	
    Chair createChair();
    Table createTable();
    Sofa createSofa();  
    
    
    Chair createChair(String material, String color,double price);



}
