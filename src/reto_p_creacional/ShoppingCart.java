package reto_p_creacional;

import java.util.List;

public class ShoppingCart {
	private static ShoppingCart instance;
	private Order order;
	private PaymentService paymentService;
	private RuleValidator ruleValidator;
	private DeliveryStrategy deliveryStrategy;

	private ShoppingCart(PaymentService paymentService, RuleValidator ruleValidator) {
		this.paymentService = paymentService;
		this.ruleValidator = ruleValidator;
	}

	public static ShoppingCart getInstance() {
		if (instance == null) {
			// Patrón Proxy, referencia al proxy
			instance = new ShoppingCart(new PaymentProxy(), new RuleValidator());
		}
		return instance;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double calculateTotal() {
		return paymentService.calculateTotal(order.getProducts());
	}

	public boolean validateRules() {
		return ruleValidator.validateRules(order.getProducts());
	}

	public void setStrategy(DeliveryStrategy deliveryStrategy) {
		this.deliveryStrategy = deliveryStrategy;
	}

	public void deliver() {
		deliveryStrategy.deliver(order.getProducts());
	}

}
