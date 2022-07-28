import java.util.*;
public class Solution {
    
    public static void main(String[] args)
    {
        // Write your code here
         Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int n1=n+1;
        int n2=(2*n)+1-n1;
         System.out.println("*");
		 for(int i=1;i<n1;i++)
	  {
	      
	       
	         System.out.print("*");
        
	       
             for(int jk=1;jk<=i;jk++)
	      {
	       
	         System.out.print(jk);
        
	       }
             
               for(int jkm=i-1;jkm>=1;jkm--)
	      {
	       
	         System.out.print(jkm);
                   
        
	       }
    System.out.println("*");
        
         }
        // System.out.println();    
        for(int i=1;i<n;i++){
            System.out.print("*");
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for(j=j-2;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.println("*");
        
