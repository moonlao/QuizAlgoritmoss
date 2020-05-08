package model;

import java.awt.Color;

public class Square extends Thread{
	
	private Color color;
	private int size;
	private int posX;
	private int posY;
	
	public Square(Color color, int posX, int posY) {
		super();
		this.color = color;
		this.size = 20;
		this.posX = posX;
		this.posY = posY;
	}
	
    public void run() {
	    while(true) {
	    	posY= posY+20;
	    	try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	posY=posY-20;
	    	try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
    }
    
    public void setColor(int color) {
    	if(color==1) {
    		this.color = new Color(0);
    	}if(color==2) {
    		this.color = new Color(255);
    	}if(color==3) {
    		this.color = new Color(255,0,0);
    	}
    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Color getColor() {
		return color;
	}
	

}
