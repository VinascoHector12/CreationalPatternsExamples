package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private String customerName;
    private PaymentService paymentService;

    public List<Product> getProducts() {
        if (products == null)
            products = new ArrayList<Product>();
        return products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static class Builder {

        private Order order;

        public Builder() {
            this.reset();
        }

        public Builder addProduct(Product product) {
            order.getProducts().add(product);
            return this;
        }

        public Builder customerName(String customerName) {
            order.setCustomerName(customerName);
            return this;
        }

        /**
         * Devuelve la orden construida y se reinicia los atributos actuales
         * 
         * @return Order
         */
        public Order build() {
            Order builtOrder = this.order;
            this.reset();
            return builtOrder;
        }

        public void reset() {
            order = new Order();
        }
    }
}
