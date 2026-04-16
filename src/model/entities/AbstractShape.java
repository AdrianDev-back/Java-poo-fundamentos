package model.entities;

import model.enums.Color2;
import model.service.Shape;

public abstract class AbstractShape implements Shape {
	
	private Color2 color;

	public AbstractShape(Color2 color) {
		this.color = color;
	}

	public Color2 getColor() {
		return color;
	}

	public void setColor(Color2 color) {
		this.color = color;
	}
	
	
	
	

}
