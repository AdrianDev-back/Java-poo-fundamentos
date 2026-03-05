package course_object_oriented;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities_enums.OrderStatusStore;
import entities.ClientStore;
import entities.OrderItemStore;
import entities.OrderStore;
import entities.ProductStore;

public class ProgramStore {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		ClientStore client = new ClientStore(nameClient, emailClient, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatusStore status = OrderStatusStore.valueOf(sc.next()); 
		
		OrderStore order = new OrderStore(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			ProductStore product = new ProductStore(productName, productPrice);
			
			OrderItemStore it = new OrderItemStore(quantity, productPrice, product);
			
			order.addItems(it);
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
		
		
	   
		
 
		sc.close();
	}

}
