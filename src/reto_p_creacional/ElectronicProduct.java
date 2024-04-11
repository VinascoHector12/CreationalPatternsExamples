package reto_p_creacional;

public class ElectronicProduct extends Product {

    public ElectronicProduct(String name, double price, Quality quality,
            GiftWrap giftWrap) {
        super(name, price, quality, giftWrap);
    }

    @Override
    public String getName() {
        return "[E] " + super.getName();
    }

}
