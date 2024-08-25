package program;
import java.util.*;
public class SearchanElementinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,20,50,40,30};
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a no: ");
      int search =sc.nextInt();
      boolean flag = false;
      for(int i=0;i<a.length;i++)
      {
    	  if(search==a[i])
    	  {
    		  System.out.println("Element found at: " +i+ " index");
    		  flag=true;
    	  }
      }
     if(flag==false)
    	 System.out.println("Element not found");
	}

}
