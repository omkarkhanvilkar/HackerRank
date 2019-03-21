package AllProblems;

/*
 * 
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */

public class VeryBigSum {

	static long aVeryBigSum(long[] ar) {
		
		long res = 0;
		for (long i : ar) {
			res += i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		System.out.println(aVeryBigSum(ar));
	}

}
