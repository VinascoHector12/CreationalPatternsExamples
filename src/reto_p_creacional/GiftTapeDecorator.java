package reto_p_creacional;

public class GiftTapeDecorator implements GiftWrap {

    private GiftWrap giftWrap;

    public GiftTapeDecorator(GiftWrap giftWrap) {
        this.giftWrap = giftWrap;
    }

    @Override
    public Double getPrice() {
        return giftWrap.getPrice() + 3.0;
    }

    @Override
    public String getDescription() {
        return giftWrap.getDescription() + " con cinta";
    }

}
