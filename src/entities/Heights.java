package entities;

public class Heights {
	
	private String name;
	private int age;
	private double height;
	
	public Heights (String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;	
	}
	
	public String Getname() {
		return name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int Getage() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public double Getheight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
