package entities;

import Entities_enums.Color;

public class ShapeCircle extends Shape {
	
	private Double radius;
	
	public ShapeCircle() {
		super();
	}
	
	public ShapeCircle(Color color, Double radius) {
		super(color);
		this.radius = radius; 
	}
	
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return  Math.PI * radius * radius;
	}
	

}
