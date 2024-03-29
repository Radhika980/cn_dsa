import  java.util.Scanner;
public class Main {
	
      static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;
 
        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;
         
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in); 
       int x = sc.nextInt();
        System.out.print(floorSqrt(x));
        
   
 
	}
}
 
