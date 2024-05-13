package reto_p_creacional;

import java.util.List;

public class RuleValidator {

	public boolean validateRules(List<Product> products) {

		Rule ruleMinimumOrder = new RuleMinimumOrder();
		Rule ruleMaximumOrder = new RuleMaximumOrder();
		Rule ruleProductTypes = new RuleProductTypes();

		ruleMinimumOrder.setNextRule(ruleMaximumOrder);
		ruleMaximumOrder.setNextRule(ruleProductTypes);

		SendEmailSubscriber sendEmailSubscriber = new SendEmailSubscriber();

		ruleMinimumOrder.subscribe(sendEmailSubscriber);
		ruleMaximumOrder.subscribe(sendEmailSubscriber);
		ruleProductTypes.subscribe(sendEmailSubscriber);

		return ruleMinimumOrder.validateRule(products);
	}
}
