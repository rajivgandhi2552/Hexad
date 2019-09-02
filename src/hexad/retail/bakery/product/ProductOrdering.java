package hexad.retail.bakery.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class ProductOrdering {

   private  HashMap<String, ProductCatalog>  productCatalog = null;

   /**
    * This method will load the catalog 
    * for future implementation replace this with cache
    */
	public void loadProductCatalog(){
		ProductInventoryImpl productInvetory = new ProductInventoryImpl();
		productCatalog = productInvetory.loadProducts();
	}
	
	/**
	 * This method will select best possible packs for given product against given count of product
	 * @param productId
	 * @param orderCount
	 * @return Selected Packs
	 */
	public  List<SubPoductCart> selectBestPacks(String productId, int orderCount){
		List<SubPoductCart> subCartList = new ArrayList<SubPoductCart>();
		ProductCatalog product = productCatalog.get(productId);
		TreeMap<Integer, Double> packAndPrice  =  product.getPackAndPrice();
		Set<Integer> packKeyList= packAndPrice.descendingKeySet();
		List<Integer>  packList = new ArrayList<Integer>();
		//Step 1: Sort the available sizes in descending order
		for(Integer pack:packKeyList)
				packList.add(pack);
		for (int i=0; i<packList.size();i++)
		{
			if(orderCount>= packList.get(i) && orderCount!=0){
				int reminder = orderCount%packList.get(i);
				int qouetient =  orderCount/packList.get(i);
				
		//Step 2 : If 
				if(reminder==0 ||( i!= packList.size()-1 && reminder >= packList.get(i+1))){
					subCartList.add(new SubPoductCart(productId,qouetient, packList.get(i),packAndPrice.get(packList.get(i))));
					orderCount = reminder;
					}
				else if (i!= packList.size()-1){
					if(orderCount -packList.get(i+1) >= packList.get(i)){
						int tmpOrdercount = orderCount -packList.get(i+1);
						reminder = tmpOrdercount%packList.get(i);
					    qouetient =  tmpOrdercount/packList.get(i);
						subCartList.add(new SubPoductCart(productId,qouetient, packList.get(i),packAndPrice.get(packList.get(i))));
						orderCount = reminder+packList.get(i+1);
					}
					
				}
				if (reminder == 0) break;
			}
		}
		
		return subCartList;
	}
	
	
	public List<ProductCart> prepareCart( Map<String,Integer> orderDeatils){
		List<ProductCart> listProductCart = new ArrayList<ProductCart>();
		orderDeatils.forEach((productId,orderCount)-> {
			System.out.println(""+productId+"=="+orderCount + " "+productCatalog.get(productId));
			ProductCart productCart = new ProductCart(productCatalog.get(productId).getProductName(),productId,selectBestPacks(productId,orderCount),orderCount);
			listProductCart.add(productCart);
		});
		
		return listProductCart;
	}
	
	
	public void printCart(List<ProductCart> listProductCart){
		 
		System.out.println("********* Your Order Details *********");
		double totalOrderPrice = 0;
		System.out.println("-----------------------------------------------------------------------------");
	    System.out.printf("%20s %10s %10s %10s %10s %10s", "PRODUCT NAME", "CODE", "PACK", "QTY", "PRICE", "Total");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------");
		for(ProductCart productCart:listProductCart){
			double totalProductPrice = 0;
			for(SubPoductCart cart :productCart.getSubCart()){
				totalProductPrice = totalProductPrice + cart.getTotalPrice();
				System.out.format("%20s %10s %10d %10d %10f %10f",
						productCart.getProductName(), productCart.getProductId(),cart.getPackName(), cart.getPackCount(), cart.getPackPrice(), cart.getTotalPrice());
				 System.out.println();
			}
			totalOrderPrice = totalOrderPrice+totalProductPrice;
		}
		System.out.println("-----------------------------------------------------------------------------");
	
		System.out.println("\tTotal Order Price "+totalOrderPrice);
	}



}
