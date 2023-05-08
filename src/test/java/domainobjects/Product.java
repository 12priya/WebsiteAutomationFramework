package domainobjects;

public class Product {

	private String id;
	private String quantity;

	public Product(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
