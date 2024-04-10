package reto_p_creacional;

public abstract class Product {
    String name;
    double price;
    Quality quality;

    abstract String getName();

    abstract double getPrice();

    public Quality getQuality() {
        return this.quality;
    }

    abstract String print();
}
