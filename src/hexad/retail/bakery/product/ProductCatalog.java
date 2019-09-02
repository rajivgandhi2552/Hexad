/**
 * 
 */
package hexad.retail.bakery.product;

import java.util.Collections;
import java.util.TreeMap;

public class ProductCatalog {
	private String productName;
	private String productId;
	private TreeMap<Integer, Double> packAndPrice = new TreeMap<Integer, Double>(Collections.reverseOrder());
	
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public TreeMap<Integer, Double> getPackAndPrice() {
		return packAndPrice;
	}
	public void setPackAndPrice(TreeMap<Integer, Double> packAndPrice) {
		this.packAndPrice = packAndPrice;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductCatalog [productName=" + productName + ", productId=" + productId + ", packAndPrice="
				+ packAndPrice + "]";
	}

}
