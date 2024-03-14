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
	
	public static class Builder {

		private Order order;

		public Builder() {
			this.reset();
		}

		public Builder addElectronicProduct(ElectronicProduct electronicProduct) {
			order.getElectronicProducts().add(electronicProduct);
			return this;
		}
		
		public Builder addClothingProduct(ClothingProduct clothingProduct) {
			order.getClothingProducts().add(clothingProduct);
			return this;
		}
		
		public Builder addFurnitureProduct(FurnitureProduct furnitureProduct) {
			order.getFurnitureProducts().add(furnitureProduct);
			return this;
		}

		public Builder customerName(String customerName) {
			order.setCustomerName(customerName);
			return this;
		}

		/**
		 * Devuelve la orden construida y se reinicia los atributos actuales
		 * @return Order
		 */
		public Order build() {
			Order builtOrder = this.order;
			this.reset();
			return builtOrder;
		}

		public void reset() {
			order = new Order();
		}
	}
}
