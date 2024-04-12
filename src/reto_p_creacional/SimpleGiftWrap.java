package reto_p_creacional;

public class SimpleGiftWrap implements GiftWrap {
    @Override
    public Double getPrice() {
        return 15.0;
    }

    @Override
    public String getDescription() {
        return "Envoltorio de regalo sencillo";
    }

}