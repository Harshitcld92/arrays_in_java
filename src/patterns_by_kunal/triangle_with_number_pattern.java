package patterns_by_kunal;

public class triangle_with_number_pattern {

	public static void main(String[] args) {
		// try to print this pattern
		/*
		      1
		    2 1 2
		  3 2 1 2 3
		4 3 2 1 2 3 4  //row no. till 1 then 2 till row
	  5 4 3 2 1 2 3 4 5
		 */
		pattern6(5);

	}
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			//for spaces
			for(int s=0;s<n-row;s++) {
				System.out.print("  ");
			}
			//loop for 4 to 1
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			//loop for 2 to 4
			for(int col=2;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
	}

}
