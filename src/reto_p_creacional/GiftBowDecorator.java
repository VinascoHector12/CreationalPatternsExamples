package reto_p_creacional;

public class GiftBowDecorator implements GiftWrap {

    private GiftWrap giftWrap;

    public GiftBowDecorator(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    @Override
    public Double getPrice() {
        return giftWrap.getPrice() + 8.0;
    }

    @Override
    public String getDescription() {
        return giftWrap.getDescription() + " con moño";
    }

}