package abstractfactory.example.modernstyle;

import abstractfactory.example.interfaces.Chair;

public class ModernChair implements Chair {
	
    private String material;
    private String color;
    private double price;

    public ModernChair() {
    }

    

    public ModernChair(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

	
    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla moderna de acero.");
    }

    @Override
    public String getDescription() {
        return String.format(
            "Silla Moderna: Material=%s, Color=%s, Precio=$%.2f",
            material, color, price
        );
    }
}