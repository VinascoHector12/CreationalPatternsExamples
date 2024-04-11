package reto_p_creacional;

public abstract class Product {
    private String name;
    private double price;
    private Quality quality;
    private GiftWrap giftWrap;

    public Product(String name, double price, Quality quality,
            GiftWrap giftWrap) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.giftWrap = giftWrap;
    }

    public String getName() {
        return this.name;
    }

    public String print() {
        return this.getName() + " - $" + getPrice() + " - "
                + getQuality().print() + " - " + getGiftWrap().getDescription()
                + " - $" + getGiftWrap().getPrice();
    }

    public double getPrice() {
        return price;
    }

    public Quality getQuality() {
        return this.quality;
    }

    public GiftWrap getGiftWrap() {
        return this.giftWrap;
    }

}
