package reto_p_creacional;

public class New implements Quality {

    private double discount;

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setPrice(double price) {
        discount = price * 0;
    }

    @Override
    public String print() {
        return "Artículo nuevo, descuento: " + this.getDiscount();
    }

}
