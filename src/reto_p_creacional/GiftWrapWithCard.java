package reto_p_creacional;

public class GiftWrapWithCard extends SimpleGiftWrap {

    @Override
    public Double getPrice() {
        return super.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con tarjeta";
    }

}
