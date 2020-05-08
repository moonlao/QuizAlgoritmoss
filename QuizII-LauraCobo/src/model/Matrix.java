package model;

public class Matrix {

	private Square[][] matrix;
	
	
	public Matrix() {
		matrix = new Square[30][20];
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length; j++) {
		    	matrix[i][j] = new Square(null, 0, 0);
		    }
		}    
	}
	
	public void setupSquare() {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length; j++) {
		 
		    	if ((i%2)==(j%2)) {
					matrix[i][j].setPosX(i*20);
					matrix[i][j].setPosY(j*20);
					matrix[i][j].setColor(2);

				}else {
					
					matrix[i][j].setPosX(i*20);
					matrix[i][j].setPosY(j*20);
					matrix[i][j].setColor(1);
				}
			}
		} 
	}

	public Square[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Square[][] matrix) {
		this.matrix = matrix;
	}

	
	
}
