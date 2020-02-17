package com.mulganov.testwork;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

import com.mulganov.testwork.figure.Circle;
import com.mulganov.testwork.figure.Rectangle;
import com.mulganov.testwork.figure.Trapeze;
import com.mulganov.testwork.figure.Triangle;

class Draw extends JComponent{
 
  public void paintComponent(Graphics g){
	super.paintComponents(g);		
	Graphics2D g2d=(Graphics2D)g;
	
	int r = (int)(new Random().nextDouble() * 200 + 10);
	
	Circle c = new Circle(g2d, "circle", "black", r);
	c.setX( (int)(new Random().nextDouble() * 200 + 10) );
	c.setY( (int)(new Random().nextDouble() * 200 + 100) );

	int w = (int)(new Random().nextDouble() * 200 + 10);
	int h = (int)(new Random().nextDouble() * 200 + 10);
	
	Rectangle rec = new Rectangle(g2d, "rec", "black", w, h);

	rec.setX( (int)(new Random().nextDouble() * 200 + 10) );
	rec.setY( (int)(new Random().nextDouble() * 200 + 100) );
	
	int a = (int)(new Random().nextDouble() * 200 + 10);
	int b = (int)(new Random().nextDouble() * 200 + 10);
	int cc = (int)(new Random().nextDouble() * 200 + 10);
	
	Triangle t = new Triangle(g2d, "t", "black", a, b, cc);
	t.setX( (int)(new Random().nextDouble() * 200 + 10) );
	t.setY( (int)(new Random().nextDouble() * 200 + 100) );

	int right = (int)(new Random().nextDouble() * 200 + 10);
	int left = (int)(new Random().nextDouble() * 200 + 10);
	int top = (int)(new Random().nextDouble() * 200 + 10);
	int down = (int)(new Random().nextDouble() * 200 + 10);
	
	Trapeze tr = new Trapeze(g2d, "tra", "black", right, left, top, down);
	tr.setX( (int)(new Random().nextDouble() * 200 + 10) );
	tr.setY( (int)(new Random().nextDouble() * 200 + 100) );
	
	
	c.draw();
	rec.draw();
	t.draw();
	tr.draw();

	System.out.println(c.toString());
	System.out.println(rec.toString());
	System.out.println(t.toString());
	System.out.println(tr.toString());
	//super.repaint();
  }	
}