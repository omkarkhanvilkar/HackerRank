package AllProblems;

/*
 * 
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen
 */

public class DiagnalDifference {
	
	public static int diagonalDifference(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int total = 0;
	
		for(int i = 0, j = cols-1; i < rows; i++, j--) {
			total += arr[i][i];
			total -= arr[i][j];
		}
		
		return Math.abs(total);
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{9,8,9}
		};
		
		System.out.println(diagonalDifference(arr));
	}

}
