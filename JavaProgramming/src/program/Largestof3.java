package program;
import java.util.*;
public class Largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int a =sc.nextInt();
		System.out.println("Enter 2nd no:");
		int b =sc.nextInt();
		System.out.println("Enter 3rd no:");
		int c =sc.nextInt();
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest of three number is "+largest);
	}

}
