import java.util.*;
import java.lang.Math;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        
   
   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        int endloop = 0, middleloop = n-1;
       for(int i=1;i<=n;i++)
       {
           //1st loop
           for(int j=0;j<endloop;j++)
               System.out.print(0);
           System.out.print("*");
           for(int j=0;j<middleloop;j++)
               System.out.print(0);
           System.out.print("*");
           for(int j=0;j<middleloop;j++)
               System.out.print(0);
            System.out.print("*");
           for(int j=0;j<endloop;j++)
               System.out.print(0);
           System.out.println();
            endloop++;
           middleloop--;
       }
	}
}
