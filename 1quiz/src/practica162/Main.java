package practica162;
import processing.core.PApplet;

public class Main extends PApplet{

	//establecer matrices
	//Matric boolean minas
	//Matriz boolean de destapada
	//win boolea
	//lose b oolean
	
	boolean[][] minas = new boolean[10][10];
	boolean[][] destapado  = new boolean[10][10];
	
	boolean win;
	boolean lose;
	
	
	
	public static void main(String[] args) {
		PApplet.main("practica162.Main");
		// TODO Auto-generated method stub
		}
		
	
	public void settings() {
		size(600,400);
		
		
	}
	
	public void setup() {
		
		win=false;
		lose=false;
		
		
		
		for (int i=0;i<10;i++) {
			for(int j =0;j<10;j++) {
				minas[i][j]=(i%2==0)? true:false;
				destapado[i][j]=false;
				
			}
		}
	
		
		
		
	}
	
	
	public void draw() {
		
		
		
		/*
		for (int i=0;i<10;i++) {
			for(int j =0;j<10;j++) {
				if(destapado[i][j]==false) {
					//Pintar gris
					fill(155);
				}else{
					//
					if(minas[i][j]==true) {
						fill(255,0,0);
					}else {
						fill(255);
					}
				}
				
				*/
		int row;
		int col;
		int x,y;
		
		for (row=0; row <30; row++) {
			for (col=0; col <30; col++) {
				x = col *20;
				y = row *20;
				if ((row%2)==(col%2))
					fill(0);
				else
					fill(155);
				rect(x,y,20,20);
			}
		}

			/*  for (int i = 0; i < 40; i++){
			      for (int j = 0; j < 40; j++){
			          if ( i+j % 2 == 0 ) {
			              fill(0);
			          } else {
			              fill(255);
			          }
			      
			  
			  
			 
			   rect(j*45,i*45,20,20);	
			
			}
			
		}*/
		
		
		
	}	
	}


