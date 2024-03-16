package patterns_by_kunal;

public class pattern_3 {

	public static void main(String[] args) {
//		* * * * *
//		* * * * 
//		* * *
//		* *
//		*
		pattern3(5);

	}
	static void pattern3(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				/*
				   in 0th row there are n columns
				   in 1st row there are n-1 columns
				            |
				            |
				            |
				   in 4th row there are n-i columns
				 */
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
