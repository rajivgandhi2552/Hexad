package hexad.retail.bakery.product;

import java.util.HashMap;
import java.util.List;

public interface ProductInventory {
	
	/**
	 * To Load the products using properties/
	 * @param productCatalog
	 * This is an Extra class created , use it if more products loaded from Properties file
	 * @return
	 */
	public static  List<ProductCatalog> Productlist =null;
	
	public HashMap<String,ProductCatalog> loadProducts();
	
	


}
