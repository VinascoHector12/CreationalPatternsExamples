package reto_p_creacional;

public class ShoppingCart {
	private static ShoppingCart instance;
	private Order order;
	private PaymentService paymentService;
	private RuleValidator ruleValidator;
	private AirPlaneStrategy airPlaneStrategy;
	private ShipStrategy shipStrategy;
	private CarStrategy carStrategy;

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

	public void deliverAirPlaneStrategy() {
		airPlaneStrategy.deliver(order.getProducts());
	}

	public void setAirPlaneStrategy(AirPlaneStrategy airPlaneStrategy) {
		this.airPlaneStrategy = airPlaneStrategy;
	}

	public void deliverShipStrategy() {
		shipStrategy.deliver(order.getProducts());
	}

	public void setShipStrategy(ShipStrategy shipStrategy) {
		this.shipStrategy = shipStrategy;
	}

	public void deliverCarStrategy() {
		carStrategy.deliver(order.getProducts());
	}

	public void setCarStrategy(CarStrategy carStrategy) {
		this.carStrategy = carStrategy;
	}

}
