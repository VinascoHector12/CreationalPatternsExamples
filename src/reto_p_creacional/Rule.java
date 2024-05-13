package reto_p_creacional;

import java.util.List;

public interface Rule {

	boolean validateRule(List<Product> products);

	void setNextRule(Rule rule);
}
