package reto_p_creacional;

public class GiftWrapWithCardWithBow extends SimpleGiftWrap {

    @Override
    public Double getPrice() {
        return super.getPrice() + 5.0 + 8.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con tarjeta con moño";
    }

}
