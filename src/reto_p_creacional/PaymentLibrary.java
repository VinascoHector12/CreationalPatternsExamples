package reto_p_creacional;

import java.util.List;

public class PaymentLibrary {

    // Lógica del servicio real
    public double calculateTotal(List<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.getPrice()
                        - product.getQuality().getDiscount()
                        + product.getGiftWrap().getPrice())
                .sum();
    }

}
