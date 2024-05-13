package reto_p_creacional;

import java.util.List;

public class AirPlaneStrategy {

	public void deliver(List<Product> products) {
		System.out.println("\nSu entrega sera via aerea, total productos: " + products.size());
	}

}
