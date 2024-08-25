package program;
import java.util.*;
public class countevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a no"); // SEQUENCE OF numbers containing even and odd no
    int a=sc.nextInt();
    int evencount=0,oddcount=0;
    while(a>0)
    {		
    	int rem=a%10; //gives the last digit when modulo by 10
    	if(rem%2==0)
    	{
    		evencount++;
    	}
    	else
    	{
    		oddcount++;
    	}
    	a=a/10;   // eliminate the last digit when divided by 10
    }
    System.out.println(evencount+" "+oddcount);    
	}

}
