package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Product> products;
    private String customerName;

    private Order(Builder builder) {
        this.products = builder.products;
        this.customerName = builder.customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static class Builder {
        private List<Product> products;
        private String customerName;

        public Builder() {
            products = new ArrayList<>();
        }

        public Builder addProduct(Product product) {
            products.add(product);
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
