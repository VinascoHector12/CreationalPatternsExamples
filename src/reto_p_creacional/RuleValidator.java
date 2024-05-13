package reto_p_creacional;

import java.util.List;

public class RuleValidator {

	public boolean validateRules(List<Product> products) {

		Rule ruleMinimumOrder = new RuleMinimumOrder();
		Rule ruleMaximumOrder = new RuleMaximumOrder();
		Rule ruleProductTypes = new RuleProductTypes();

		ruleMinimumOrder.setNextRule(ruleMaximumOrder);
		ruleMaximumOrder.setNextRule(ruleProductTypes);

		return ruleMinimumOrder.validateRule(products);
	}
}
