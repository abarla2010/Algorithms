package exercises;

/**
 * Created by abhishekbarla on 12/4/16.
 * Given a 2D matrix M, filled with either 0s or 1s, count the number of islands of 1s in M.
 * An island is a group of adjacent values that are all 1s. Every cell in M can be adjacent to
 * the 4 cells that are next to it on the same row or column.
 */
public class IslandCount {

	public static void main(String[] args){
		int[][] matrix = {	{0,1,0,1,0},
							{0,0,1,1,1},
							{1,0,0,1,0},
							{0,1,1,0,0},
							{1,0,1,0,1}	};

		int count = islandCount(matrix);
		System.out.println(count);
	}

	/**
	 * Method to find out the number of islands for a given matrix
	 * @param matrix
	 * @return
	 */
	public static int islandCount(int[][]matrix){
		int islands = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;

		if(rows <= 0 || matrix == null){
			return 0;
		}

		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				if(matrix[i][j] == 1){
					if(isValidIsland(matrix, rows, columns, i, j)){
						System.out.println("[" + i + ", " + j + "]");
						islands++;
					}
				}
			}
		}
		return islands;
	}

	/**
	 * Helper method to check if the island is valid
	 * @param matrix
	 * @param numRows
	 * @param numColumns
	 * @param row
	 * @param column
	 * @return
	 */
	public static boolean isValidIsland(int[][] matrix, int numRows, int numColumns, int row, int column){
		//Corner 1
		if(row == 0 && column == 0){
			if(checkNextElementInRow(matrix, numRows, numColumns, row, column) && checkBelowElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//Corner 2
		else if(row == 0 && column == numColumns-1){
			if(checkPreviousElementInRow(matrix, numRows, numColumns, row, column) && checkBelowElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//Corner 3
		else if(row == numRows-1 && column==0){
			if(checkNextElementInRow(matrix, numRows, numColumns, row, column) && checkAboveElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//Corner 4
		else if(row == numRows-1 && column== numColumns-1){
			if(checkPreviousElementInRow(matrix, numRows, numColumns, row, column) && checkAboveElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//First Row
		else if(row == 0){
			if(		checkPreviousElementInRow(matrix, numRows, numColumns, row, column) ||
					checkNextElementInRow(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//Last Row
		else if(row == numRows-1){
			if(		checkPreviousElementInRow(matrix, numRows, numColumns, row, column) ||
					checkNextElementInRow(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//First Column
		else if(column == 0){
			if(		checkBelowElementInColumn(matrix, numRows, numColumns, row, column) ||
					checkAboveElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		//Last Column
		else if(column == numColumns-1){
			if(		checkBelowElementInColumn(matrix, numRows, numColumns, row, column) ||
					checkAboveElementInColumn(matrix, numRows, numColumns, row, column)){
				return true;
			}
		}

		else{
			if(		checkBelowElementInColumn(matrix, numRows, numColumns, row, column) ||
					checkAboveElementInColumn(matrix, numRows, numColumns, row, column) ||
					checkPreviousElementInRow(matrix, numRows, numColumns, row, column) ||
					checkNextElementInRow(matrix, numRows, numColumns, row, column)){
				return true;
				}
			}

		return false;
	}

	public static boolean checkNextElementInRow(int[][] matrix, int numRows, int numColumns, int row, int column){
		if(matrix[row][column+1]==1){
			return true;
		}
		return false;
	}

	public static boolean checkBelowElementInColumn(int[][] matrix, int numRows, int numColumns, int row, int column){
		if(matrix[row+1][column]==1){
			return true;
		}
		return false;
	}

	public static boolean checkAboveElementInColumn(int[][] matrix, int numRows, int numColumns, int row, int column){
		if(matrix[row-1][column]==1){
			return true;
		}
		return false;
	}

	public static boolean checkPreviousElementInRow(int[][] matrix, int numRows, int numColumns, int row, int column){
		if(matrix[row][column-1]==1){
			return true;
		}
		return false;
	}


}
