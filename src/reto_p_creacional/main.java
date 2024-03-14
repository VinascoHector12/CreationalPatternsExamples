package reto_p_creacional;

public class main {

	public static void main(String[] args) {
		System.out.println("Creación de carrito de compras");

		// Instanciación múltiple del carro de compras - X Patron Singleton
		ShoppingCart cart = new ShoppingCart();

		// Patron Factory
		Product phone = ProductFactory.createProduct("electronic", "Smartphone", 500);
		Product shirt = ProductFactory.createProduct("clothing", "T-shirt", 20);
		Product sofa = ProductFactory.createProduct("furniture", "double sofa", 350);

		// Creación de un objeto complejo - X Patron Builder
		Order order = new Order();
		order.getProducts().add(phone);
		order.getProducts().add(shirt);
		order.getProducts().add(sofa);
		order.setCustomerName("Juan Pérez");

		// Se crea la orden en una de las instancias del carrito
		cart.setOrder(order);
		System.out.println("\nPedido para " + cart.getOrder().getCustomerName());

		// Se imprime todos los productos gracias al patrón Factory
		for (Product product : cart.getOrder().getProducts()) {
			System.out.println(product.print());
		}
	}
}
