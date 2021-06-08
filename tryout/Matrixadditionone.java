package tryout;

public class Matrixadditionone {
	public static void main(String args[]) {
         Matrixadditionone m=new Matrixadditionone();
         m.matrixad();
         
		
	}


public void matrixad() {
int a[]= {1,2,3};
int b[]= {2,3,4};
int c[]= new int[3];
for(int i=0;i<3;i++) {
	c[i]=a[i]+b[i];
	System.out.print(c[i]+" ");
}

}
}