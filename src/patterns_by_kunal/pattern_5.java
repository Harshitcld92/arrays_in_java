package patterns_by_kunal;

public class pattern_5 {

	public static void main(String[] args) {
		/*
		   try to make this pattern
		  C R
		  1 0 *
		  2 1 * *
		  3 2 * * *
		  4 3 * * * *
		  5 4 * * * * *   
		  6 5 * * * * |
		  7 6 * * *   |
		  8 7 * *_____|   here we are ignoring 3 * ,which is (row-n+1)=7-5+1=>3, which are getting ignored from n, therefore(n-(row-n+1))=2n-row-1
		  9 8 * 
		 */
		pattern5(5);

	}
	static void pattern5(int n) {
		for(int row=0;row<2*n;row++) {//because we have 9 rows
			int totalNoOfColsInRow=row>n? 2*n-row:row;
			for(int c=0;c<totalNoOfColsInRow;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
