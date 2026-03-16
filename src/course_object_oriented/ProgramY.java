package course_object_oriented;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProductY;
import entities.Product;
import entities.ProductY;
import entities.UsedProductY;

public class ProgramY {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<ProductY> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProductY(name, price, customFee));
			} 
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProductY(name, price, manufactureDate));
			} 
			else {
				list.add(new ProductY(name, price));
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (ProductY p : list) {
			System.out.println(p.priceTag());
		}
 
		sc.close();
	}

}
