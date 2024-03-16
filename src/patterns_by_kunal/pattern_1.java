package patterns_by_kunal;

public class pattern_1 {

	public static void main(String[] args) {
		//I have to make this pattern
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		pattern1(5);
		// now try to print this pattern
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		System.out.println();
		pattern2(5);

	}
	static void pattern1(int n) {//n is the no. of rows in the pattern
		for(int row=1;row<=n;row++) {//outer loop will run (no. of row in the pattern) times
			//for inner loop we have to identify that for every 
			//- - row how many columns are there
			//Here, for every ith row there are i columns, therefore
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
