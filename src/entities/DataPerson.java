package entities;

public class DataPerson {
	
	private double height;
	private char gender;
	
	public DataPerson (double height, char gender) {
		this.height = height;
		this.gender = gender;
	}
	
	public double Getheighte() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public char Getgender() {
		return this.gender;
		
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
