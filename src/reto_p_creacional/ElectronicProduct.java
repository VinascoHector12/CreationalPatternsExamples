package reto_p_creacional;

public class ElectronicProduct {
	private String name;
	private double price;

	public ElectronicProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return "[E] " + name;
	}

	public double getPrice() {
		return price;
	}

	public String print() {
		return "[E] " + name + " - $" + price;
	}
}
