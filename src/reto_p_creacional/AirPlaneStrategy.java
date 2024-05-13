package reto_p_creacional;

import java.util.List;

public class AirPlaneStrategy implements DeliveryStrategy {

	@Override
	public void deliver(List<Product> products) {
		System.out.println("\nSu entrega se sera por via aerea, total productos: " + products.size());
	}

}
