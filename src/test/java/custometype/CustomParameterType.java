package custometype;

import domainobjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {
	
	@ParameterType(".*")
	public Product product(String quantity)
	{
		return new Product(quantity);
	}
}
