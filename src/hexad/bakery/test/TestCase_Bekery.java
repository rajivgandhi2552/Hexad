/**
 * 
 */
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
 * @author rajivgandhi.nagappag
 *
 */
public class TestCase_Bekery {

	@Test
	
	public void test() 
	{
		ProductOrdering order = new ProductOrdering();
		order.loadProductCatalog();
		List<SubPoductCart> cart= order.selectBestPacks("ProductVS5", 11);
		List<SubPoductCart> cartMB11= order.selectBestPacks("ProductMB11", 11);
		List<SubPoductCart> cartVS5= order.selectBestPacks("ProductCF", 11);
	}

}
