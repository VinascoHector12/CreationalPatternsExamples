package reto_p_creacional;

public abstract class Product {
    private String name;
    private double price;
    private String type;
    private double discount;
    private GiftWrap giftWrap;

    public Product(String name, double price, String type, GiftWrap giftWrap) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.giftWrap = giftWrap;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return 0.0;
    }

    public GiftWrap getGiftWrap() {
        return this.giftWrap;
    }

    // "NEW, descuento: " + this.getDiscount();
    public String print() {
        return this.getName() + " - $" + getPrice() + " - " + type
                + ", descuento: " + this.getDiscount() + " - "
                + getGiftWrap().getDescription() + " - $"
                + getGiftWrap().getPrice();
    }

}
