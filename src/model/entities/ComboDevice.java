package model.entities;

import model.service.PrinterService;
import model.service.ScannerService;

public class ComboDevice extends Device implements ScannerService, PrinterService  {
	
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
		
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
		
	}

}
