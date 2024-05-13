package reto_p_creacional;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creación de carrito de compras");

		// Patron Strategy
		DeliveryStrategy deliveryStrategy = new AirPlaneStrategy();

		// Patron Singleton
		ShoppingCart cart = ShoppingCart.getInstance();
		cart.setStrategy(deliveryStrategy);

		// Patron Factory, Bridge y Decorator
		Product phone = ProductFactory.createProduct("electronic", "Smartphone", 5000, new Used(),
				new GiftCardDecorator(new SimpleGiftWrap()));
		Product shirt = ProductFactory.createProduct("clothing", "T-shirt", 20, new New(),
				new GiftBowDecorator(new GiftTapeDecorator(new SimpleGiftWrap())));
		Product sofa = ProductFactory.createProduct("furniture", "double sofa", 350, new Used(),
				new GiftBowDecorator(new GiftCardDecorator(new GiftTapeDecorator(new SimpleGiftWrap()))));

		// Patron Builder
		Order order = new Order.Builder().addProduct(phone).addProduct(shirt).addProduct(sofa)
				.customerName("Juan Pérez").build();

		cart.setOrder(order);
		System.out.println("\nPedido para " + cart.getOrder().getCustomerName());

		for (Product product : cart.getOrder().getProducts()) {
			System.out.println(product.print());
		}

		// Patron Proxy
		System.out.println("\ncosto total: $" + ShoppingCart.getInstance().calculateTotal() + "\n");

		// Patron Chain Of Responsibility y Observer
		System.out.println("\nLas reglas son validas?: " + ShoppingCart.getInstance().validateRules());

		cart.deliver();
	}
}
