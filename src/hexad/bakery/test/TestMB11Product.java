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
public class TestMB11Product {
	
	/**
	 * Test Case for Testing MB11 Product
	 * Quantity of 23
	 * It will have below output
	 * ===========================
	 * 23MB11 $76.8
	 * 2 X 8 $24.95
	 * 1 X 5 $16.95
	 * 1 X 2 $9.95
	 * ===============================
	 */
	@Test
	public void testMB11Product(){
		
		ProductOrdering order = new ProductOrdering();
		order.loadProductCatalog();
		
		List<SubPoductCart> cartMB11 = order.selectBestPacks("MB11", 23);
		assertEquals( 2 ,cartMB11.get(0).getPackCount());
		assertEquals (8, cartMB11.get(0).getPackName());
		
		assertEquals( 1 ,cartMB11.get(1).getPackCount());
		assertEquals (5, cartMB11.get(1).getPackName());
		
		assertEquals( 1 ,cartMB11.get(2).getPackCount());
		assertEquals (2, cartMB11.get(2).getPackName());
        System.out.println("MB11 selected successfully"); 
		
	
		
		
		
	}
	
	}
