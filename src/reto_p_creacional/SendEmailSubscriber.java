package reto_p_creacional;

public class SendEmailSubscriber implements InvalidRuleSubscription {

	public void notify(String description) {
		System.out.println("\nNotificacion recibida, fallo de regla: " + description);
	}

}
