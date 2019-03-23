package AllProblems;

public class CoinChangeProblem {
	
	
	static long getWays(long n, long[] c) {
		//Base case
		if(c.length == 0 || c == null) return 0;
		
		long[] ways = new long[(int)n + 1];
		ways[0] = 1;
		
		for (int i = 0; i < c.length; i++) {
			for(int j = 0; j < ways.length; j++) {
				if(c[i] <= j) {
					ways[j] += ways[(int) (j - c[i])]; 
				}
			}
		}
		
		return ways[(int) n];
		
	}

	public static void main(String[] args) {
		long[] coins = {1 ,5, 10};
		System.out.println(getWays(12, coins));
	}

}
