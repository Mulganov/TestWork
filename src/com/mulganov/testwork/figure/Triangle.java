package com.mulganov.testwork.figure;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends Figure {

	private int a, b, c;
	
	public Triangle(Graphics2D g, String name, String color, int a, int b, int c) {
		super(name, color);
		this.a = a;
		this.b = b;
		this.c = c;
		
		super.setDrawRun(new Runnable() {
			@Override
			public void run() {
				g.drawLine(getX(), getY(),  getA(), getA());
				
				g.drawLine(getA(), getA(), getB(), getB());
				
				g.drawLine(getB(), getB(), getX(), getY());
			}
		});
	}
	
	public String toString() {
		String text = "";
		text += "Name: " + getName() + "\n";
		text += "A: " + a + "\n";
		text += "B: " + b + "\n";
		text += "C: " + c + "\n";
		text += "Perimeter: " + getPerimeter() + "\n";
		text += "Space: " + getSpace() + "\n";
		return text;
	}
	
	public int getSpace() {
		float p = (a + b + c) / 2;
		return (int) Math.sqrt( p * (p - a) * (p - b) * (p - c) );
	}
	
	public int getPerimeter() {
		return a + b + c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
