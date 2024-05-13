package reto_p_creacional;

import java.util.List;

public class RuleMinimumOrder {

	private SendEmailSubscriber sendEmailSubscriber;

	public final static double MINIMUM = 400.0;

	public boolean validateRule(List<Product> products) {
		System.out.println("VALIDANDO REGLA VALOR MINIMO ORDEN " + MINIMUM);

		double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.getPrice();
		}

		if (totalPrice < MINIMUM) {
			notifySubscribers();
			return false;
		}
		return true;
	}

	public void subscribe(SendEmailSubscriber sendEmailSubscriber) {
		this.sendEmailSubscriber = sendEmailSubscriber;
	}

	public void notifySubscribers() {
		sendEmailSubscriber.notify("REGLA INVALIDA VALOR MINIMO ORDEN");
	}
}
