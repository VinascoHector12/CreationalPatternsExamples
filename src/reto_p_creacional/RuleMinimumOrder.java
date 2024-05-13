package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class RuleMinimumOrder {

	private List<InvalidRuleSubscription> invalidRuleSubscriptions;

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

	public void subscribe(InvalidRuleSubscription invalidRuleSubscription) {
		if (invalidRuleSubscriptions == null)
			invalidRuleSubscriptions = new ArrayList<InvalidRuleSubscription>();

		invalidRuleSubscriptions.add(invalidRuleSubscription);

	}

	public void notifySubscribers() {
		for (InvalidRuleSubscription invalidRuleSubscription : invalidRuleSubscriptions) {
			invalidRuleSubscription.notify("REGLA INVALIDA VALOR MINIMO ORDEN");
		}
	}
}
