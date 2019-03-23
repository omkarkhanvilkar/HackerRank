package AllProblems;

/*
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

public class MiniMaxSum {

	public static void main(String[] args) {
		
		long[] arr = {1,2, 3, 4, 5};
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		long total = 0;
		
		for(long i : arr) {
			total += i;
			min = Math.min(i, min);
			max = Math.max(i, max);
		}
		
		System.out.println((total - max) + " " + (total - min));
		
	}

}
