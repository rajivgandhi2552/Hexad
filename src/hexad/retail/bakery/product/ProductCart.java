package hexad.retail.bakery.product;

import java.util.List;

public class ProductCart {
	
	private String productName;
	private String productId;
	private int orderedCount;
	private List<SubPoductCart> subCart  ;
	
	/**
	 * @param productName
	 * @param productId
	 * @param subCart
	 * @param orderedCount 
	 */
	public ProductCart(String productName, String productId, List<SubPoductCart> subCart, int orderedCount) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.orderedCount = orderedCount;
		this.subCart = subCart;
	}
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
	/**
	 * @return the subCart
	 */
	public List<SubPoductCart> getSubCart() {
		return subCart;
	}
	/**
	 * @param subCart the subCart to set
	 */
	public void setSubCart(List<SubPoductCart> subCart) {
		this.subCart = subCart;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductCart [productName=" + productName + ", productId=" + productId + ", subCart=" + subCart.toString() + "]";
	}
	/**
	 * @return the orderedCount
	 */
	public int getOrderedCount() {
		return orderedCount;
	}
	/**
	 * @param orderedCount the orderedCount to set
	 */
	public void setOrderedCount(int orderedCount) {
		this.orderedCount = orderedCount;
	}
	

}
