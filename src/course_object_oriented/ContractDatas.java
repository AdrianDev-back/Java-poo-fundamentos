package course_object_oriented;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installment;
import model.service.PaypalService;

public class ContractDatas {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter with datas of contract: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Data: (dd/MM/yyyy): ");
		sc.nextLine();
		String dateString = sc.nextLine();
		System.out.print("Value contract: ");
		double valueContract = sc.nextDouble();
		System.out.print("Enter a number of installments: ");
		int months = sc.nextInt();
		
		Contract contract = new Contract(number,sdf.parse(dateString), valueContract);
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, months);
		
		System.out.println("INSTALLMENTS:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + "-" + String.format("%.2f", installment.getAmount()));
			
		}

		
		sc.close();
	}

}
