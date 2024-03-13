package reto_p_creacional;

public class main {

	public static void main(String[] args) {
		System.out.println("Creación de carrito de compras");
		
		// Patron Singleton
		ShoppingCart cart = ShoppingCart.getInstance();
		
		// Patron Factory
        Product phone = ProductFactory.createProduct("electronic", "Smartphone", 500);
        Product shirt = ProductFactory.createProduct("clothing", "T-shirt", 20);
        
		
		cart.addProduct(phone); 
		cart.addProduct(shirt);
		
		System.out.println("\nProductos en el carrito:");
		
		for (Product product : cart.getProducts()) {
		System.out.println(product.getName() + " - $" + product.getPrice()); }
		 

        // Patron Builder
        Order order = new Order.Builder()
                .addProduct(phone)
                .addProduct(shirt)
                .customerName("Juan Pérez")
                .build();
        
        System.out.println("\nPedido para " + order.getCustomerName() + ":");
        
        for (Product product : order.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}
