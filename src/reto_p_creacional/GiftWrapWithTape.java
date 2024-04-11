package reto_p_creacional;

public class GiftWrapWithTape extends SimpleGiftWrap {

    @Override
    public Double getPrice() {
        return super.getPrice() + 3.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con cinta";
    }

}
