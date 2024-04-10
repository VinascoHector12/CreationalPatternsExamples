package reto_p_creacional;

public class ElectronicProduct extends Product {

    public ElectronicProduct(String name, double price, Quality quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String getName() {
        return "[E] " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "[E] " + name + " - $" + price;
    }

}
