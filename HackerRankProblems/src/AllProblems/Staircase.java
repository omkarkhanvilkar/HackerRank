package AllProblems;

/*
 * https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen
 */

public class Staircase {
	
	static void staircase(int n) {
		int space = 0;		
		for(int i = 0; i < n; i++) {
			space = n - i - 1;
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for(int k = space; k < n; k++) {
				System.out.print("#");
			}
			
			System.out.println();
		}

    }

	public static void main(String[] args) {
		
		staircase(7);
	}

}
