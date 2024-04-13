package reto_p_creacional;

public class GiftCardDecorator implements GiftWrap {

    private GiftWrap giftWrap;

    public GiftCardDecorator(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    @Override
    public Double getPrice() {
        return giftWrap.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return giftWrap.getDescription() + " con tarjeta";
    }

}
