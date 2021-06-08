package tryout;

public class Sudokuvalid {
	public static void main(String[] args) {
		
	Sudokuvalid validate = new Sudokuvalid();
	validate.SudokuValidation(matrix);
		
	}
		
		private static int[][] matrix = {
		        {6,5,1,8,7,3,2,9,4},
		        {7,4,3,2,5,9,1,6,8},
		        {9,8,2,1,6,4,3,5,7},
		        {1,2,5,4,3,6,8,7,9},
		        {4,3,9,5,8,7,6,1,2},
		        {8,6,7,9,1,2,5,4,3},
		        {5,7,8,3,9,1,4,2,6},
		        {2,1,6,7,4,8,9,3,5},
		        {3,9,4,6,2,5,7,8,1}
		    };
		public void SudokuValidation(int[][] matrix2) {

			//651873294743259168982164357125436879439587612867912543578391426216748935394625781
			int sum=0,row=0,col=0;
			for(int i=0;i<9;i++)
			{
				
				
				
				sum = sum+matrix2[row][i];
				
				
			}
			if(sum==45) {
				System.out.println("row valid");}
			else {
				System.out.println("row invalid");}
			
			
			int sum1=0;
			for(int i=0;i<9;i++)
			{
				
				sum1 = sum1+matrix2[i][col];
				
				
				
			}

			if(sum1==45) {
				System.out.println("column valid");}
			else {
				System.out.println("column invalid");}
			
			int sumterm=0;
			
	        for(int i=0;i<9;i++)
	        {
	        	int row_start = (i/3)*3;
		        int col_start = (i%3)*3;
		        
	           
		        for(int j=row_start;j<row_start+3;j++)
		        {
		            for(int k=col_start;k<col_start+3;k++)
		            {
		            	sumterm=+matrix2[j][k] ;
		            }
		        }
	         }
	        if(sumterm == 45) {
				System.out.println("grid valid");}
			else {
				System.out.println("grid invalid");}
	        
	     
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
}