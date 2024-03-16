package patterns_by_kunal;

public class rhombus_with_numbers {

	public static void main(String[] args) {
		// try to print this pattern
		/*
		        1
		       212
		      32123
		     4321234
		      32123
		       212
		        1
		       
		    
		 */
		pattern7(4);

	}
	static void pattern7(int n) {
		for(int row=1;row<=2*n;row++) {
			int c=row>n?2*n-row:row;
			
			//for space
			for(int space=0;space<n-c;space++) {
				System.out.print("  ");
			}
			for(int col=c;col>=1;col--) {
				System.out.print(col+ " ");
			}
			for(int col=2;col<=c;col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}

}
