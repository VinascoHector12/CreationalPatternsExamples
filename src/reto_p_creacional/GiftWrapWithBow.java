package reto_p_creacional;

public class GiftWrapWithBow extends SimpleGiftWrap {

    @Override
    public Double getPrice() {
        return super.getPrice() + 8.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con moño";
    }

}
