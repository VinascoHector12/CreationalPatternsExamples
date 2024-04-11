package reto_p_creacional;

public class ClothingProduct extends Product {

    public ClothingProduct(String name, double price, Quality quality,
            GiftWrap giftWrap) {
        super(name, price, quality, giftWrap);
    }

    @Override
    public String getName() {
        return "[C] " + super.getName();
    }

}