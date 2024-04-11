package reto_p_creacional;

public class ShoppingCart {
    private static ShoppingCart instance;
    private Order order;
    private PaymentLibrary paymentLibrary;

    private ShoppingCart(PaymentLibrary paymentLibrary) {
        this.paymentLibrary = paymentLibrary;
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            // Patrón Proxy, referencia al proxy
            instance = new ShoppingCart(new PaymentLibrary());
        }
        return instance;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double calculateTotal() {
        return paymentLibrary.calculateTotal(order.getProducts());
    }

}
