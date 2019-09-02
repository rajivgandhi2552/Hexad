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
public class TestVS5Product {
	
	
	/**
	 * Test Case for Testing VS5 Product
	 * Quantity of 11
	 * It will have below output
	 * ===========================
	 * 11VS5 $22.77
	 * 1 X 5 $8.99
	 * 2 X 3 $6.89
	 * ===============================
	 */
	@Test
	public void testMB11Product(){
		
		ProductOrdering order = new ProductOrdering();
		order.loadProductCatalog();
		
		List<SubPoductCart> cartVS5 = order.selectBestPacks("MB11", 11);
		assertEquals( 1 ,cartVS5.get(0).getPackCount());
		assertEquals (5, cartVS5.get(0).getPackName());
		
		assertEquals( 3 ,cartVS5.get(1).getPackCount());
		assertEquals (2, cartVS5.get(1).getPackName());
        System.out.println("VS5 selected successfully"); 
		
	
		
		
		
	}
	
	}
