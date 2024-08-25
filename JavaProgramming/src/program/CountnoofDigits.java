package program;
import java.util.Scanner;
public class CountnoofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
    
     int a = sc.nextInt();  //12345
     int count=0;
     while(a>0)
     {
    	 a=a/10;  //eliminate last digit and count it as a digit
    	 count++;  
     }
     System.out.println(count);
	}

}
