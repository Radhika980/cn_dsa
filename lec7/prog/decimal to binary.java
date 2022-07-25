import java.util.*;
public class Main 
{
	
	public static void main(String[] args) 
    {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        long n = num;
        long pv=1;
        long ans=0;
        long rem=0;
        while(n>0)
        {
            rem=n%2;
          ans=ans+ rem*pv;
             n=n/2;
            pv=pv*10;
           
        }
        System.out.print(ans);     
    }
}
