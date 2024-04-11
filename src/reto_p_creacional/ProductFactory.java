package reto_p_creacional;

public class ProductFactory {

    public static Product createProduct(String type, String name, double price,
            Quality quality, GiftWrap giftWrap) {
        quality.setPrice(price);

        switch (type.toLowerCase()) {

        case "electronic":
            return new ElectronicProduct(name, price, quality, giftWrap);

        case "clothing":
            return new ClothingProduct(name, price, quality, giftWrap);

        case "furniture":
            return new FurnitureProduct(name, price, quality, giftWrap);

        default:
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
