package reto_p_creacional;

public class ShoppingCart {
	private static ShoppingCart instance;
	private Order order;

	private ShoppingCart() {
	}

	public static ShoppingCart getInstance() {
		if (instance == null) {
			instance = new ShoppingCart();
		}
		return instance;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
