package reto_p_creacional;

import java.util.List;

public class PaymentProxy implements PaymentService {

    private PaymentService paymentService;

    public PaymentProxy() {
        this.paymentService = new PaymentLibrary();
    }

    @Override
    public double calculateTotal(List<Product> products) {
        this.auditExpensiveProducts(products);
        return paymentService.calculateTotal(products);
    }

    private void auditExpensiveProducts(List<Product> products) {
        System.out.println("\nExpensive products...");
        products.stream().filter(product -> product.getPrice() >= 400.0)
                .forEach(product -> System.out.println(product.print()));
    }

}
