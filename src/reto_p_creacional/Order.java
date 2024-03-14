package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Product> products;
	private String customerName;
	
	public List<Product> getProducts() {
		if (products == null)
			products = new ArrayList<Product>();
		return products;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
