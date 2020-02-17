package com.mulganov.testwork;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

		  public static void main(String[] args) {
			  
				/* Задание заголовка окна*/
				JFrame w=new JFrame("Окно с изображением");
				/*Задание размеров окна*/
				w.setSize(800, 800);
			 
			/* 	Если у окна не будет функции закрытия, 
			 *	при нажатии крестика окно не закроется.*/
				w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			/*	Менеджер определяет
			 *  каким образом в окне расположены объекты.*/
				w.setLayout(new BorderLayout(1,1));
				
				Draw canv=new Draw();
		        w.add(canv);		
		        w.setVisible(true);	
		  }
}
