package program;

import java.util.HashSet;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String arr[]= {"java","c","java","python","python"};
   /*  for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]==arr[j])
    		 {
    			 System.out.println("Found duplicate element:"+arr[i]);
    		 }
    	 }
     }
     */
		//HashSet
		
		HashSet <String> langs =new HashSet();
		String arr[]= {"java","c","java","python","python"};
		for(String l:arr)
		{
		  if(langs.add(l)==false)   //duplicates can't be added in hash set
		  {
			  System.out.println(l);
		  }
		}
	}

}
