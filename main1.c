

#include<stdio.h>

int main(){
 
   int r,s,rows=0;
 
   int t=1;

    scanf("%d",&rows);
   
 printf("\n");
  
  printf("*");
 
   for(r=1;r<=rows;++r,t=1){
        
for(s=1;s<=rows-r;++s){
            
printf(" ");
        }
     
   while(t!=2*r-1){
            
printf("*");
           
 ++t;
        }
       
 printf("\n");
   
 }
    
return 0;
}