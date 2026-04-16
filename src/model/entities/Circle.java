package model.entities;

import model.enums.Color2;

;

public class Circle extends AbstractShape{

	private Double radius;
	
	public Circle(Color2 color, Double radius) {
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
		return Math.PI * radius * radius;
	}

}
