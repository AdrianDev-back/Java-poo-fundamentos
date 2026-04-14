package model.entities;

import model.service.ScannerService;

public class ConcreteScanner extends Device implements ScannerService{
	
	
	public ConcreteScanner (String serialNumber) {
	  super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
	
	

}
