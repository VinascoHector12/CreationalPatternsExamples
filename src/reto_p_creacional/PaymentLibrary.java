package reto_p_creacional;

import java.util.List;

public class PaymentLibrary implements PaymentService {

    // Lógica del servicio real
    @Override
    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(product -> product.getPrice()
                - product.getDiscount() + product.getGiftWrap().getPrice())
                .sum();
    }

}