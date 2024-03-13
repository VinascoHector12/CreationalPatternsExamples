package reto_p_creacional;

public class ElectronicProduct implements Product {
	private String name;
	private double price;

	public ElectronicProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return "[E] " + name;
	}

	@Override
	public double getPrice() {
		return price;
	}
}
