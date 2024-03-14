package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<ElectronicProduct> electronicProducts;
	private List<ClothingProduct> clothingProducts;
	private List<FurnitureProduct> furnitureProducts;
	private String customerName;
	
	public List<ElectronicProduct> getElectronicProducts() {
		if (electronicProducts == null)
			electronicProducts = new ArrayList<ElectronicProduct>();
		return electronicProducts;
	}
	
	public List<ClothingProduct> getClothingProducts() {
		if (clothingProducts == null)
			clothingProducts = new ArrayList<ClothingProduct>();
		return clothingProducts;
	}
	
	public List<FurnitureProduct> getFurnitureProducts() {
		if (furnitureProducts == null)
			furnitureProducts = new ArrayList<FurnitureProduct>();
		return furnitureProducts;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
