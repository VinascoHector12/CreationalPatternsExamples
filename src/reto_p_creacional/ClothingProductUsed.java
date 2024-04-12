package reto_p_creacional;

public class ClothingProductUsed extends Product {

    public ClothingProductUsed(String name, double price, String type,
            GiftWrap giftWrap) {
        super(name, price, type, giftWrap);
    }

    @Override
    public String getName() {
        return "[C] " + super.getName();
    }

    @Override
    public double getDiscount() {
        return super.getPrice() * 0.3;
    }

}