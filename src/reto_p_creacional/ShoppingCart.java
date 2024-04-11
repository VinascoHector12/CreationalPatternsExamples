package reto_p_creacional;

public class ShoppingCart {
    private static ShoppingCart instance;
    private Order order;
    private PaymentService paymentService;

    private ShoppingCart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            // Patrón Proxy, referencia al proxy
            instance = new ShoppingCart(new PaymentProxy());
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
        return paymentService.calculateTotal(order.getProducts());
    }

}
