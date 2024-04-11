package reto_p_creacional;

public class FurnitureProduct extends Product {

    public FurnitureProduct(String name, double price, Quality quality,
            GiftWrap giftWrap) {
        super(name, price, quality, giftWrap);
    }

    @Override
    public String getName() {
        return "[F] " + super.getName();
    }

}