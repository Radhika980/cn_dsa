import java.util.*;
public class Main 
{
	
	public static void main(String[] args) 
    {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n = num;
        int pv=1;
        int ans=0;
        while(n>0)
        {
             int dig = n%10;
            // System.out.println(ans);
            ans=ans+ dig*pv;
            pv=pv*2;
            n = n / 10;
           
        }
        System.out.print(ans);     
    }
}
