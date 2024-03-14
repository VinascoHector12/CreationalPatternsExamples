package reto_p_creacional;

public class main {

	public static void main(String[] args) {
		System.out.println("Creación de carrito de compras");

		// Instanciación múltiple del carro de compras - X Patron Singleton
		ShoppingCart cart = new ShoppingCart();

		// Creación de objetos por separado, a pesar de compartir atributos y comportamientos similares - X Patron Factory
		ElectronicProduct phone = new ElectronicProduct("Smartphone", 500);
		ClothingProduct shirt = new ClothingProduct("T-shirt", 20);
		FurnitureProduct sofa = new FurnitureProduct("double sofa", 350);

		// Creación de un objeto complejo - X Patron Builder
		Order order = new Order();
		order.getElectronicProducts().add(phone);
		order.getClothingProducts().add(shirt);
		order.getFurnitureProducts().add(sofa);
		order.setCustomerName("Juan Pérez");

		// Se crea la orden en una de las instancias del carrito
		cart.setOrder(order);
		System.out.println("\nPedido para " + cart.getOrder().getCustomerName());

		// Se imprime todos los tipos de producto por separado
		for (ElectronicProduct electronicProduct : order.getElectronicProducts()) {
			System.out.println(electronicProduct.print());
		}
		
		for (ClothingProduct clothingProduct : order.getClothingProducts()) {
			System.out.println(clothingProduct.print());
		}
		
		for (FurnitureProduct furnitureProduct : order.getFurnitureProducts()) {
			System.out.println(furnitureProduct.print());
		}
	}
}
