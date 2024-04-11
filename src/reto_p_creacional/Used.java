package reto_p_creacional;

public class Used implements Quality {

    private double discount;

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double price) {
        discount = price * 0.3;
    }

    @Override
    public String print() {
        return "USED, descuento: $" + this.getDiscount();
    }

}
