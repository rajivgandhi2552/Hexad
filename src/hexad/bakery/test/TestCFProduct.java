package hexad.bakery.test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hexad.retail.bakery.product.ProductOrdering;
import hexad.retail.bakery.product.SubPoductCart;

/**
 * 
 */

/**
 * @author RajivGandhi BN
 *
 */
public class TestCFProduct {
	
	
	/**
	 * Test Case for Testing CF Product
	 * Quantity of 35
	 * It will have below output
	 * ===========================
	 * 35CF $69.649
	 * 3 X 9 $16.99
	 * 1 X 5 $9.95
	 * 1 X 3 $5.95
	 * ===============================
	 */
	@Test
	public void testCFProduct(){
		
		ProductOrdering order = new ProductOrdering();
		order.loadProductCatalog();
		
		List<SubPoductCart> cartCF = order.selectBestPacks("CF", 35);
		assertEquals( 3 ,cartCF.get(0).getPackCount());
		assertEquals (9, cartCF.get(0).getPackName());
		
		assertEquals( 1 ,cartCF.get(1).getPackCount());
		assertEquals (5, cartCF.get(1).getPackName());
		
		assertEquals( 1,cartCF.get(2).getPackCount());
		assertEquals (3, cartCF.get(2).getPackName());
        System.out.println("CF selected successfully");
		
	
		
		
		
	}
	
	}
