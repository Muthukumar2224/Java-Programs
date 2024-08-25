package program;
import java.util.*;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int a =sc.nextInt();
    int sum=0;
    while(a>0)
    {
    	sum=sum+a%10;
    	a=a/10;
    }
    System.out.println("Sum of digits of a Number: "+'\n'+sum);
	}

}
