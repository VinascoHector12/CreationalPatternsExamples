package reto_p_creacional;

public class GiftWrapWithTapeWithBow extends SimpleGiftWrap {

    @Override
    public Double getPrice() {
        return super.getPrice() + 3.0 + 8.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con cinta con moño";
    }

}