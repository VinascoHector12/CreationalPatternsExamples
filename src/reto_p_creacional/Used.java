package reto_p_creacional;

public class Used implements Quality {

    private double discount;

    public Used() {
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setPrice(double price) {
        discount = price * 0.3;
    }

}
