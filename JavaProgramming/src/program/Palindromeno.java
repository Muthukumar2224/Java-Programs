package program;

import java.util.Scanner;

public class Palindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a No:");
      int num = sc.nextInt(); //121
      int orgnum = num;
      int rev=0;
      while(num!=0)
      {
    	  rev=rev*10+num%10; //0+1 //10+2 //120+1=121
    	  num=num/10; //12 //1
      }
      if(orgnum==rev)
      {
    	 System.out.println("The entered no: "+orgnum+" is palindrome"); 
      }
      else
      {
    	 System.out.println("The entered no: "+orgnum+" is not a palindrome");
      }
      
	}

}
