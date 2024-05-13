package reto_p_creacional;

import java.util.List;

public class CarStrategy {

	public void deliver(List<Product> products) {
		System.out.println("\nSu entrega sera via terrestre, total productos: " + products.size());
	}

}
