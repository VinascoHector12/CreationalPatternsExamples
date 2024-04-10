package reto_p_creacional;

public class ClothingProduct extends Product {

    public ClothingProduct(String name, double price, Quality quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String getName() {
        return "[C] " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "[C] " + name + " - $" + price;
    }
}