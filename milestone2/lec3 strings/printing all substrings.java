public class Solution {

	public static void printSubstrings(String str) 
    {
		//Your code goes here
        
        int n=str.length();
        //int end_in=0;
       
        for(int start=0;start<n;start++)
        {
        for(int end=start;end<n;end++)
        {
           System.out.println(str.substring(start,end+1));
            
            
        }
            //System.out.println("");
        }
        
	}

}
