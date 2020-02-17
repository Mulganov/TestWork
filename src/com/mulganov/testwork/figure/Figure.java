package com.mulganov.testwork.figure;

import java.awt.Graphics2D;

public class Figure {

	private String name;
	private String color;
	private Runnable drawRun;
	
	private int x;
	private int y;
	
	private boolean draw;
	
	public Figure(String name, String color) {
		this.name = name;
		this.color = color;
		draw = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDraw() {
		return draw;
	}

	public void setDraw(boolean draw) {
		this.draw = draw;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		if ( isDraw() ) {
			drawRun.run();
		}
	}

	public Runnable getDrawRun() {
		return drawRun;
	}

	public void setDrawRun(Runnable drawRun) {
		this.drawRun = drawRun;
	}
	
	
}
