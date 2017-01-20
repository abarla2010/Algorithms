package exercises;

import java.util.ArrayList;

/**
 * Created by abhishekbarla on 12/8/16.
 */
public class MatrixSpiral {
	public static void main(String[] args){
		int[][] inputMatrix = { {1,2,3}, {4,5,6}, {7,8,9}};
		ArrayList<Integer> output = spiralOrder(inputMatrix);
		System.out.println(output);
	}

	public static ArrayList<Integer> spiralOrder(int[][] matrix){
		ArrayList<Integer> result = new ArrayList<>();
		if(matrix.length==0 || matrix ==null){
			return result;
		}

		int rows = matrix.length;
		int columns = matrix[0].length;

		int x = 0;
		int y = 0;

		while(rows > 0 && columns > 0){

			//If one row or one column is left, then no circle can be formed
			if(rows==1){
				for(int i=0; i<columns; i++){
					result.add(matrix[x][y++]);
				}
				break;
			}
			else if(columns==1){
				for(int i=0; i<rows; i++){
					result.add(matrix[x++][y]);
				}
				break;
			}

			//Iterate in a circle

			//Move Right
			for(int i=0; i<columns-1; i++){
				result.add(matrix[x][y++]);
			}

			//Move Down
			for(int i=0; i<rows-1; i++){
				result.add(matrix[x++][y]);
			}

			//Move Left
			for(int i=0; i<columns-1; i++){
				result.add(matrix[x][y--]);
			}

			//Move Up
			for(int i=0; i<rows-1; i++){
				result.add(matrix[x--][y]);
			}

			x++;
			y++;
			rows = rows-2;
			columns = columns-2;

		}

		return result;
	}
}
