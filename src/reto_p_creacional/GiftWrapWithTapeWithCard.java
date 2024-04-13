package reto_p_creacional;

public class GiftWrapWithTapeWithCard implements GiftWrap {

    @Override
    public Double getPrice() {
        return 15.0 + 3.0 + 5.0;
    }

    @Override
    public String getDescription() {
        return "Envoltorio de regalo sencillo con cinta con tarjeta";
    }

}
