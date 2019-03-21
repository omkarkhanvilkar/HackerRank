package AllProblems;


public class PositiveNegativeZeros {
	
	static void plusMinus(int[] arr) {
		double pos = 0, neg = 0, zero = 0;
		int n = arr.length;
		if (arr.length < 0) return;
		
		for(int i : arr) {
			if(i == 0) zero++;
			else if (i < 0) neg++;
			else pos++;			
		}
		System.out.printf("%.6f %n", (double)pos/n);
		System.out.printf("%.6f %n", (double)neg/n);
		System.out.printf("%.6f %n", (double)zero/n);
	}
	
	

	public static void main(String[] args) {
		int[] arr = {-4, 3, -9, 0, 4, 1};
		plusMinus(arr);
	}

}
