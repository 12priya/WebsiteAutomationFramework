package constants;

public enum EndPoint {

	CART("/cart");
	
	public final String url;
	
	EndPoint(String url){
		this.url=url;
	}
	
}
