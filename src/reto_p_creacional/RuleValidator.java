package reto_p_creacional;

import java.util.List;

public class RuleValidator {

	public boolean validateRules(List<Product> products) {

		RuleMinimumOrder ruleMinimumOrder = new RuleMinimumOrder();
		RuleMaximumOrder ruleMaximumOrder = new RuleMaximumOrder();
		RuleProductTypes ruleProductTypes = new RuleProductTypes();

		SendEmailSubscriber sendEmailSubscriber = new SendEmailSubscriber();

		ruleMinimumOrder.subscribe(sendEmailSubscriber);
		ruleMaximumOrder.subscribe(sendEmailSubscriber);
		ruleProductTypes.subscribe(sendEmailSubscriber);

		return ruleMinimumOrder.validateRule(products) && ruleMaximumOrder.validateRule(products)
				&& ruleProductTypes.validateRule(products);
	}
}
