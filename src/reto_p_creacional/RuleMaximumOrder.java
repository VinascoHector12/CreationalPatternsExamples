package reto_p_creacional;

import java.util.List;

public class RuleMaximumOrder {

	private SendEmailSubscriber sendEmailSubscriber;

	public final static double MAXIMUM = 1000.0;

	public boolean validateRule(List<Product> products) {
		System.out.println("VALIDANDO REGLA VALOR MAXIMO ORDEN " + MAXIMUM);

		double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.getPrice();
		}

		if (totalPrice > MAXIMUM) {
			notifySubscribers();
			return false;
		}
		return true;
	}

	public void subscribe(SendEmailSubscriber sendEmailSubscriber) {
		this.sendEmailSubscriber = sendEmailSubscriber;
	}

	public void notifySubscribers() {
		sendEmailSubscriber.notify("REGLA INVALIDA VALOR MAXIMO ORDEN");
	}

}
