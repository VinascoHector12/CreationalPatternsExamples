package reto_p_creacional;

public class FurnitureProduct {
	private String name;
	private double price;

	public FurnitureProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return "[F] " + name;
	}

	public double getPrice() {
		return price;
	}

	public String print() {
		return "[F] " + name + " - $" + price;
	}
}