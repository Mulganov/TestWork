package com.mulganov.testwork.figure;

import java.awt.Graphics2D;

public class Circle extends Figure {

	private int radius;
	
	public Circle(Graphics2D g, String name, String color, int r) {
		super(name, color);
		this.radius = r;
		
		super.setDrawRun(new Runnable() {
			@Override
			public void run() {
				g.drawOval(getX(), getY(), radius, radius);
			}
		});
	}

	public String toString() {
		String text = "";
		text += "Name: " + getName() + "\n";
		text += "Radius: " + getRadius() + "\n";
		text += "Length: " + getLength() + "\n";
		text += "Space: " + getSpace() + "\n";
		return text;
	}
	
	public int getLength() {
		return (int) (Math.PI * 2 * radius);
	}
	
	public int getSpace() {
		return (int) (Math.PI * Math.PI * radius);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
