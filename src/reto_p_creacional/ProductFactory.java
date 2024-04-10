package reto_p_creacional;

public class ProductFactory {

    public static Product createProduct(String type, String name, double price,
            Quality quality) {
        quality.setPrice(price);

        switch (type.toLowerCase()) {

        case "electronic":
            return new ElectronicProduct(name, price, quality);

        case "clothing":
            return new ClothingProduct(name, price, quality);

        case "furniture":
            return new FurnitureProduct(name, price, quality);

        default:
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
