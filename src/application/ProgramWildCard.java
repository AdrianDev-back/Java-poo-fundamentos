package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.service.Shape;

public class ProgramWildCard {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(null, 3.0, 2.0));
		myShapes.add(new Circle(null, 2.0));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(null, 2.0));
		myCircle.add(new Circle(null, 3.0));
		
		System.out.println("Total area: " +  String.format("%.2f",totalArea(myCircle)));

	}
	
	public static Double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
		
	}

}
