/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/


#include<stdio.h>

int main(){

 int n,i,j;
    
scanf("%d",&n);
    
for(i=0;i<=n;i++){
        
for(j=0;j<i;j++){
            
printf("*");
        }
        
printf("\n");
    }
    
return 0;
}
