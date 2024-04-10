package reto_p_creacional;

public class FurnitureProduct extends Product {

    public FurnitureProduct(String name, double price, Quality quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String getName() {
        return "[F] " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "[F] " + name + " - $" + price;
    }
}