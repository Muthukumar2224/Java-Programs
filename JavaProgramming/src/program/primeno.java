package program;
import java.util.*;
public class primeno {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a no:");
     int a =sc.nextInt(); //prime no is a number divided by 1 and itself
     int count=0;
     if(a>1)
     {
    	 for(int i=1;i<=a;i++)  
    	 {
    		 if(a%i==0)
    	       count++;   //so count should be 2 for a prime no.
    	 }
    	 if(count==2)
    	 {
    			 System.out.println("Entered no is a prime no");
    	 }
    	 else
    	 {
    			 System.out.println("Entered no is not a prime no");
    	 }
      }
     else 
     {
    	 System.out.println("Entered no is not a prime no");
     }   
	}
}
