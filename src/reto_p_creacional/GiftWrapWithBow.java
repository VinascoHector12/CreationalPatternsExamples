package reto_p_creacional;

public class GiftWrapWithBow implements GiftWrap {

    @Override
    public Double getPrice() {
        return 15.0 + 8.0;
    }

    @Override
    public String getDescription() {
        return "Envoltorio de regalo sencillo con moño";
    }

}
