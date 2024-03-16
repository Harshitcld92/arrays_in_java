package patterns_by_kunal;

public class rhombus_pattern {

	public static void main(String[] args) {
		//try to print this pattern
		/*   ____*    4 spaces in first row
		        * *
		       * * *
		      * * * *
		     * * * * *
		      * * * *
		       * * *
		        * *
		         *
		 */
		patternRhombus(5);
		

	}
	static void patternRhombus(int n) {
		for(int row=0;row<2*n;row++) {
			int totalColsInRow=row>n? 2*n-row:row;
			int totalspaces=n-totalColsInRow;
			for(int s=0;s<totalspaces;s++) {
				System.out.print(" ");
			}
			for(int col=0;col<totalColsInRow;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}

}
