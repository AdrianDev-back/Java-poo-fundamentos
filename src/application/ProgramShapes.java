package application;


import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color2;

public class ProgramShapes {

	public static void main(String[] args) {
	
		AbstractShape s1 = new Circle(Color2.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color2.WHIHE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle are: " + String.format("%.2f",s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
		
		

	}

}
