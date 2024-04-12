package reto_p_creacional;

public abstract class GiftWrapDecorator implements GiftWrap {

    private GiftWrap giftWrap;

    public GiftWrapDecorator(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    @Override
    public Double getPrice() {
        return giftWrap.getPrice();
    }

    @Override
    public String getDescription() {
        return giftWrap.getDescription();
    }

}