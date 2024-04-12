package reto_p_creacional;

public class GiftTapeDecorator extends GiftWrapDecorator {

    public GiftTapeDecorator(GiftWrap giftWrap) {
        super(giftWrap);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 3.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con cinta";
    }

}