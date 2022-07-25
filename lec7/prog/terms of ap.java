import java.util.*;
public class Main 
{
	
	public static void main(String[] args)
    {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m = 1;
        for(int i=1;i<=n;)
        {
            int k=3*m+2;
            if(k%4!=0)
            {
             i++;
            System.out.print(k);
            System.out.print(" ");
            }
            
            m++;
        }

	}
}
