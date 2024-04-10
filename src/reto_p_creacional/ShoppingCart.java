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

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
