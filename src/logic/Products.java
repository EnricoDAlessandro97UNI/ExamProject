package logic;

public class Products {
	
	private String[] availableProducts = {"pizza", "beef steak", "coke"};
	
	public boolean isAvailable(String product) {
		boolean ret = false;
		for(String p : availableProducts) {
			if(p.charAt(0) ==  product.charAt(0)) {
				ret = true;
			}
		}
		return ret;		
	}

}
