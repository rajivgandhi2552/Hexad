package hexad.retail.bakery.product;

import java.util.HashMap;
import java.util.Scanner;

public class OrderOnline {

	public static void main(String[] args) {

		System.out.println("Welecome to Hexad Bakery Portal");
		Scanner scanner = new Scanner(System.in);
		ProductOrdering order = new ProductOrdering();
		order.loadProductCatalog();
		HashMap<String, Integer> orderMap = new HashMap<String, Integer>();
		System.out.println("Select Product from below List");
		System.out.print("Vegemite Scrol(Code VS5 & Avilable in Pack of 5,3 ): ");
		int v5Count = scanner.nextInt();
		orderMap.put("VS5", v5Count);
		System.out.print("Blueberry Muffin(Code:MB11 & Avilable in Pack of 2,5,8) :");
		int mb11 = scanner.nextInt();
		orderMap.put("MB11", mb11);
		System.out.print("Croissant(Code:CF & Avilable in Pack of  3,5 and 9 ) :");
		int cf = scanner.nextInt();
		orderMap.put("CF", cf);
		
		scanner.close();
		order.printCart(order.prepareCart(orderMap));
	}

}
