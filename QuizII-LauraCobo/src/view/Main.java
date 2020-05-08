package view;

import java.awt.Color;

import model.*;
import processing.core.*;

public class Main extends PApplet {

	public Matrix matrix;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}

	public void settings() {
		size(600, 400);
	}

	public void setup() {
		matrix = new Matrix();
		matrix.setupSquare();

	}

	public void draw() {
		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				
				if (matrix.getMatrix()[i][j].getColor().equals(new Color(0))) {
					fill(0);
				} if (matrix.getMatrix()[i][j].getColor().equals(new Color(255))) {
					fill(255);
				} if (matrix.getMatrix()[i][j].getColor().equals(new Color(255,0,0))) {
					fill(255,0,0);
				} 
				
				  rect(matrix.getMatrix()[i][j].getPosX(),matrix.getMatrix()[i][j].getPosY(),20,20);		
				  
			}

		}
	}
	
	public void mouseClicked() {
		System.out.println("Ready ");

		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				if(i%2!=0) {
					matrix.getMatrix()[i][j].run();
					
				}
				
				  
			}

		}		
		
	}

}
