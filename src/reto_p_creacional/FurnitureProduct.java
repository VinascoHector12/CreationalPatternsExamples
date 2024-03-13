package reto_p_creacional;

public class FurnitureProduct implements Product {
	private String name;
	private double price;

	public FurnitureProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return "[F] " + name;
	}

	@Override
	public double getPrice() {
		return price;
	}
}