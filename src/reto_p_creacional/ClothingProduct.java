package reto_p_creacional;

public class ClothingProduct {
	private String name;
	private double price;

	public ClothingProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return "[C] " + name;
	}

	public double getPrice() {
		return price;
	}

	public String print() {
		return "[C] " + name + " - $" + price;
	}
}