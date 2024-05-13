package reto_p_creacional;

import java.util.List;

public class ShipStrategy {

	public void deliver(List<Product> products) {
		System.out.println("\nSu entrega sera via maritima , total productos: " + products.size());
	}

}
