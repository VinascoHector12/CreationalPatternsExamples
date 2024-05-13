package reto_p_creacional;

import java.util.List;

public class RuleMaximumOrder implements Rule {

	private Rule nextRule;

	public final static double MAXIMUM = 1000.0;

	@Override
	public boolean validateRule(List<Product> products) {
		System.out.println("VALIDANDO REGLA VALOR MAXIMO ORDEN " + MAXIMUM);

		double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.getPrice();
		}

		if (totalPrice > MAXIMUM)
			return false;
		else if (nextRule != null)
			return nextRule.validateRule(products);
		return true;
	}

	@Override
	public void setNextRule(Rule rule) {
		this.nextRule = rule;
	}

}
