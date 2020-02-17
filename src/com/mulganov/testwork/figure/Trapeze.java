package com.mulganov.testwork.figure;

import java.awt.Graphics2D;

public class Trapeze extends Figure {
	
	private int right, left, top, down;

	public Trapeze(Graphics2D g, String name, String color, int right, int left, int top, int down) {
		super(name, color);
		this.right = right;
		this.left = left;
		this.down = down;
		this.top = top;
		
		super.setDrawRun(new Runnable() {
			@Override
			public void run() {
				int down = right + left + top;
				g.drawLine(getX(), getY(), getX() + right, getY() - right);
				g.drawLine(getX() + right, getY() - right, getX() + right + top, getY() - right);
				g.drawLine(getX(), getY(), getX() + down, getY());
				g.drawLine(getX() + right + top, getY() - right, getX() + down, getY());
			}
		});
	}
	public String toString() {
		String text = "";
		text += "Name: " + getName() + "\n";
		text += "Right: " + right + "\n";
		text += "Top: " + top + "\n";
		text += "Left: " + left + "\n";
		text += "Down: " + down + "\n";
		text += "Perimete: " + getPerimeter() + "\n";
		return text;
	}
	
	public int getPerimeter() {
		return right + left + top + down;
	}
	
	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

}
