package reto_p_creacional;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creación de carrito de compras");

		// Patron Singleton
		ShoppingCart cart = ShoppingCart.getInstance();

		// Patron Factory
		Product phone = ProductFactory.createProduct("electronic", "Smartphone", 500);
		Product shirt = ProductFactory.createProduct("clothing", "T-shirt", 20);
		Product sofa = ProductFactory.createProduct("furniture", "double sofa", 350);

		// Patron Builder
		Order order = new Order.Builder()
				.addProduct(phone)
				.addProduct(shirt)
				.addProduct(sofa)
				.customerName("Juan Pérez")
				.build();

		// Se crea la orden en la instancia unica del carrito
		cart.setOrder(order);
		System.out.println("\nPedido para " + cart.getOrder().getCustomerName());

		for (Product product : cart.getOrder().getProducts()) {
			System.out.println(product.print());
		}

	}
}
