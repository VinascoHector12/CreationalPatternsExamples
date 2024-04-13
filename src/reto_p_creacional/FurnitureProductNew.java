package reto_p_creacional;

public class FurnitureProductNew implements Product {

    private String name;
    private double price;
    private String type;
    private GiftWrap giftWrap;

    public FurnitureProductNew(String name, double price, String type,
            GiftWrap giftWrap) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.giftWrap = giftWrap;
    }

    @Override
    public String getName() {
        return "[C] " + name;
    }

    @Override
    public double getDiscount() {
        return price * 0;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public GiftWrap getGiftWrap() {
        return giftWrap;
    }

    @Override
    public String print() {
        return this.getName() + " - $" + getPrice() + " - " + type
                + ", descuento: " + this.getDiscount() + " - "
                + getGiftWrap().getDescription() + " - $"
                + getGiftWrap().getPrice();
    }

}