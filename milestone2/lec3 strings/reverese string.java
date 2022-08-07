public class Main
{
	public static void main(String[] args) {
	
	   String str="Coding ninjas";
        int n=str.length();
        String reverse_string=" ";
       
        for(int i=0;i<n;i++)
        {
            reverse_string=str.charAt(i)+reverse_string;
            
        }
       	System.out.println(reverse_string);
            
	}

}
