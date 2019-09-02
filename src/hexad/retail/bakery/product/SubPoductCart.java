package hexad.retail.bakery.product;

public class SubPoductCart {

	
	private String  productId;
	private int  packCount;
	private int  packName;
	private double packPrice;
	
	
	public SubPoductCart(String productId, int packCount, int packName, double packPrice) {
		super();
		this.productId = productId;
		this.packCount = packCount;
		this.packName = packName;
		this.packPrice = packPrice;
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
	 * @return the packCount
	 */
	public int getPackCount() {
		return packCount;
	}
	/**
	 * @param packCount the packCount to set
	 */
	public void setPackCount(int packCount) {
		this.packCount = packCount;
	}
	/**
	 * @return the packName
	 */
	public int getPackName() {
		return packName;
	}
	/**
	 * @param packName the packName to set
	 */
	public void setPackName(int packName) {
		this.packName = packName;
	}
	/**
	 * @return the packPrice
	 */
	public double getPackPrice() {
		return packPrice;
	}
	/**
	 * @param packPrice the packPrice to set
	 */
	public void setPackPrice(double packPrice) {
		this.packPrice = packPrice;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getTotalPrice()
	{
			return (this.getPackPrice() * this.getPackCount());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubPoductCart [productId=" + productId + ", packCount=" + packCount + ", packName=" + packName
				+ ", packPrice=" + packPrice + "]";
	}
}
