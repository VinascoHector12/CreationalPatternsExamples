package reto_p_creacional;

public class GiftCardDecorator extends GiftWrapDecorator {

    public GiftCardDecorator(GiftWrap giftWrap) {
        super(giftWrap);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con tarjeta";
    }

}