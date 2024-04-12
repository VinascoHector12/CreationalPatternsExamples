package reto_p_creacional;

public class ProductFactory {

    public static Product createProduct(String type, String name, double price,
            GiftWrap giftWrap) {

        switch (type.toLowerCase()) {

        case "electronic_new":
            return new ElectronicProductNew(name, price, "NEW", giftWrap);

        case "clothing_new":
            return new ClothingProductNew(name, price, "NEW", giftWrap);

        case "furniture_new":
            return new FurnitureProductNew(name, price, "NEW", giftWrap);

        case "electronic_used":
            return new ElectronicProductUsed(name, price, "USED", giftWrap);

        case "clothing_used":
            return new ClothingProductUsed(name, price, "USED", giftWrap);

        case "furniture_used":
            return new FurnitureProductUsed(name, price, "USED", giftWrap);

        default:
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
