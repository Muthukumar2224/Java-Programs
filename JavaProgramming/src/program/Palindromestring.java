package program;
import java.util.*;
public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String str = sc.next();
      String rev="";

      for(int i=str.length()-1;i>=0;i--)
      {
    	  rev=rev+str.charAt(i); 	 
      }
      System.out.println(rev);
      if(str.equals(rev))
      {
    	  System.out.println("The Entered string "+str+" is a palindrome");
      }
      else
      {
    	  System.out.println("The Entered string "+str+" is not a palindrome");
      }
	}

}
