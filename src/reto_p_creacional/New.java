package reto_p_creacional;

public class New implements Quality {

    private double discount;

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double price) {
        discount = price * 0;
    }

    @Override
    public String print() {
        return "NEW, descuento: " + this.getDiscount();
    }

}
