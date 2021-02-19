package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import logic.Products;

public class TestProduct {

	@Test
	public void testProductAvailability() {
		Products products = new Products();
		boolean ret = false;
		String productToCheck = "pizza";
		ret = products.isAvailable(productToCheck);
		assertEquals(true, ret);
	}
	
}
