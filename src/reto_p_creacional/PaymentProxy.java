package reto_p_creacional;

import java.util.List;

public class PaymentProxy implements PaymentService {

    // Patrón Proxy
    private PaymentService paymentService;

    public PaymentProxy() {
        // Patrón Proxy, referencia al servicio real
        this.paymentService = new PaymentLibrary();
    }

    @Override
    public double calculateTotal(List<Product> products) {
        // Patrón Proxy, realiza alguna lógica y después llama al servicio real
        this.auditExpensiveProducts(products);
        return paymentService.calculateTotal(products);
    }

    private void auditExpensiveProducts(List<Product> products) {
        System.out.println("\nExpensive products...");
        products.stream().filter(product -> product.getPrice() >= 400.0)
                .forEach(product -> System.out.println(product.print()));
    }

}
