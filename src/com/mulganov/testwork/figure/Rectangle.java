package com.mulganov.testwork.figure;

import java.awt.Graphics2D;

public class Rectangle extends Figure{
	private int width;
	private int height;
	
	
	public Rectangle(Graphics2D g, String name, String color, int w, int h) {
		super(name, color);
		this.width = w;
		this.height = h;
		
		super.setDrawRun(new Runnable() {
			@Override
			public void run() {
				g.drawRect(getX(), getY(), width, height);
			}
		});
	}
	public String toString() {
		String text = "";
		text += "Name: " + getName() + "\n";
		text += "Width: " + width + "\n";
		text += "Height: " + height + "\n";
		text += "Space: " + getSpace() + "\n";
		text += "Perimeter: " + getPerimeter() + "\n";
		return text;
	}
	public float getSpace() {
		return width * height;
	}
	
	public float getPerimeter() {
		return width * 2 + height * 2;
	}
	
}
