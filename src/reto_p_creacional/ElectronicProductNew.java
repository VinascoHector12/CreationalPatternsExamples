package reto_p_creacional;

public class ElectronicProductNew extends Product {

    public ElectronicProductNew(String name, double price, String type,
            GiftWrap giftWrap) {
        super(name, price, type, giftWrap);
    }

    @Override
    public String getName() {
        return "[E] " + super.getName();
    }

    @Override
    public double getDiscount() {
        return super.getPrice() * 0;
    }

}
