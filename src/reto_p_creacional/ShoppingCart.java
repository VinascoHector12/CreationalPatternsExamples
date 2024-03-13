package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private static ShoppingCart instance;
    private List<Product> products;
    private Order order;

    private ShoppingCart() {
        products = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}    
    
}
