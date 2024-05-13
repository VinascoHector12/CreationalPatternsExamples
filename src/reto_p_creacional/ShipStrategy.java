package reto_p_creacional;

import java.util.List;

public class ShipStrategy implements DeliveryStrategy {

	@Override
	public void deliver(List<Product> products) {
		System.out.println("\nSu entrega se sera por maritima , total productos: " + products.size());
	}

}
