package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class RuleMaximumOrder {

	private List<InvalidRuleSubscription> invalidRuleSubscriptions;

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

	public void subscribe(InvalidRuleSubscription invalidRuleSubscription) {
		if (invalidRuleSubscriptions == null)
			invalidRuleSubscriptions = new ArrayList<InvalidRuleSubscription>();

		invalidRuleSubscriptions.add(invalidRuleSubscription);

	}

	public void notifySubscribers() {
		for (InvalidRuleSubscription invalidRuleSubscription : invalidRuleSubscriptions) {
			invalidRuleSubscription.notify("REGLA INVALIDA VALOR MAXIMO ORDEN");
		}
	}
}
