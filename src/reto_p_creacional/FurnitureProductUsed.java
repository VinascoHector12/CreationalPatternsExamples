package reto_p_creacional;

public class FurnitureProductUsed extends Product {

    public FurnitureProductUsed(String name, double price, String type,
            GiftWrap giftWrap) {
        super(name, price, type, giftWrap);
    }

    @Override
    public String getName() {
        return "[F] " + super.getName();
    }

    @Override
    public double getDiscount() {
        return super.getPrice() * 0.3;
    }
}