package reto_p_creacional;

public class FurnitureProduct implements Product {

	private String type;
	private String name;
	private double price;
	private Quality quality;
	private GiftWrap giftWrap;

	public FurnitureProduct(String type, String name, double price, Quality quality, GiftWrap giftWrap) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.quality = quality;
		this.giftWrap = giftWrap;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getName() {
		return "[F] " + name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public Quality getQuality() {
		return quality;
	}

	@Override
	public GiftWrap getGiftWrap() {
		return giftWrap;
	}

	@Override
	public String print() {
		return this.getName() + " - $" + getPrice() + " - " + getQuality().print() + " - "
				+ getGiftWrap().getDescription() + " - $" + getGiftWrap().getPrice();
	}

}