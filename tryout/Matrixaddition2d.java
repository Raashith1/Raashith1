package tryout;

public class Matrixaddition2d {
	public static void main(String args[]) {
		Matrixaddition2d m =  new Matrixaddition2d();
	   m.Matrixadd();
	   
	}


   public void Matrixadd() {
	int input1[][]={{1,3,4},{2,4,3},{3,4,5}};    
	int input2[][]={{1,3,4},{2,4,3},{1,2,4}};    
	    
	  
	int result[][]=new int[3][3];    
	    
	//adding and printing addition of 2 matrices    
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	result[i][j]=input1[i][j]+input2[i][j];    //use - for subtraction  
	System.out.print( result[i][j]+" ");
	}    
	System.out.println();//new line    
	}
	
   }
}




