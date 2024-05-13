package reto_p_creacional;

public class ProductFactory {

	public static Product createProduct(String type, String name, double price, Quality quality, GiftWrap giftWrap) {
		quality.setDiscount(price);

		switch (type.toLowerCase()) {

		case "electronic":
			return new ElectronicProduct(type, name, price, quality, giftWrap);

		case "clothing":
			return new ClothingProduct(type, name, price, quality, giftWrap);

		case "furniture":
			return new FurnitureProduct(type, name, price, quality, giftWrap);

		default:
			throw new IllegalArgumentException("Invalid product type: " + type);
		}
	}
}
