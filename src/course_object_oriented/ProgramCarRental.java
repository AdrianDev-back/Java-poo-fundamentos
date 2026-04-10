package course_object_oriented;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.BrazilTaxService_Interface;
import entities.CarRental_Interface;
import entities.RentalService_Interface;
import entities.Vehicle_Interface;

public class ProgramCarRental {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter with datas of rental");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Withdrawal (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return (dd/MM/yyyy hh/mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental_Interface cr = new CarRental_Interface(start, finish, new Vehicle_Interface(carModel));
		
		System.out.print("Enter with a price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter with a price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService_Interface rentalService = new RentalService_Interface(pricePerHour, pricePerDay, new BrazilTaxService_Interface());

		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("Tax: " + cr.getInvoice().getTax());
		System.out.println("Total payment: " + cr.getInvoice().totalPayment());
		
		
		
		sc.close();
		
	}

}
