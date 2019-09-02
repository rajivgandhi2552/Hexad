/**
 * 
 */
package hexad.retail.bakery.product;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;

/**
 * @author RajivGandhi BN
 *
 */
public class ProductInventoryImpl implements ProductInventory {

	/**
	 * This class created for Product Catalog to assign Products and its Packs
	 * @
	 */
	public ProductInventoryImpl() {
		
	}

	

	@Override
	public HashMap<String, ProductCatalog> loadProducts() {
		
		HashMap<String, ProductCatalog>  productcatalog = new HashMap<String, ProductCatalog>();
		/**
		 * VS5 Product and Packs
		 */
		
		ProductCatalog vs5 = new ProductCatalog();
		vs5.setProductId("VS5");
		vs5.setProductName("Vegemite Scroll");
		TreeMap<Integer, Double> vs5packAndPrice = new TreeMap<Integer, Double>();
		vs5packAndPrice.put(3, 6.89);
		vs5packAndPrice.put(5, 8.99);
		vs5.setPackAndPrice(vs5packAndPrice);
		productcatalog.put("VS5", vs5);
		
		/**
		 * MB11 Product and Packs
		 */
		ProductCatalog mb11 = new ProductCatalog();
		mb11.setProductId("MB11");
		mb11.setProductName("Blueberry Muffin");
		TreeMap<Integer, Double> mb11PackAndPrice = new TreeMap<Integer, Double>();
		mb11PackAndPrice.put(2, 9.95);
		mb11PackAndPrice.put(5, 16.95);
		mb11PackAndPrice.put(8, 24.95);
		mb11.setPackAndPrice(mb11PackAndPrice);
		productcatalog.put("MB11", mb11);
		
		/**
		 * CF Product and Packs
		 */
		ProductCatalog cf = new ProductCatalog();
		cf.setProductId("CF");
		cf.setProductName("Croissant");
		TreeMap<Integer, Double> cfPackAndPrice = new TreeMap<Integer, Double>();
		cfPackAndPrice.put(3, 5.95);
		cfPackAndPrice.put(5, 9.95);
		cfPackAndPrice.put(9, 16.99);
		cf.setPackAndPrice(cfPackAndPrice);
		productcatalog.put("CF", cf);		
		
		
		
		
		
		return productcatalog;
	}

}
