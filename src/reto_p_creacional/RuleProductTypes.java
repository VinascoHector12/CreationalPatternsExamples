package reto_p_creacional;

import java.util.ArrayList;
import java.util.List;

public class RuleProductTypes {

	private List<InvalidRuleSubscription> invalidRuleSubscriptions;

	public final static int MAXIMUM_TYPE = 1;

	public boolean validateRule(List<Product> products) {
		System.out.println("VALIDANDO REGLA TIPO DE PRODUCTOS REPETIDOS " + MAXIMUM_TYPE);

		int clothingCounter = 0;
		int electronicCounter = 0;
		int furnitureCounter = 0;
		for (Product product : products) {

			if (product.getType().equals("electronic"))
				clothingCounter++;

			else if (product.getType().equals("clothing"))
				electronicCounter++;

			else if (product.getType().equals("furniture"))
				furnitureCounter++;
		}

		if (clothingCounter > MAXIMUM_TYPE || electronicCounter > MAXIMUM_TYPE || furnitureCounter > MAXIMUM_TYPE) {
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
			invalidRuleSubscription.notify("REGLA INVALIDA TIPO DE PRODUCTOS REPETIDOS");
		}
	}
}
