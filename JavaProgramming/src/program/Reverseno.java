package program;
import java.util.*;
public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a no:");
     int num = sc.nextInt();
     
     //1) using algorithm
     /*  int rev=0;
     while(num!=0)
     {
    	 rev= rev*10+num%10;
    	 num=num/10;
    	 
    	 Any number modulo by 10 gives last number(modulo - remainder)
    	 ex : 4321%10 = 1

    	Any number divide by 10 gives except the last number(divide - quotient)
    	 ex : 4321/10 = 432 
     } */
	
     // Using StringBuffer class
     
    /* StringBuffer sb = new StringBuffer(String.valueOf(num));
     StringBuffer rev = sb.reverse();*/
     
     // Using StringBuilder class
     	StringBuilder sbl = new StringBuilder();
     	sbl.append(num);
     	
     	StringBuilder rev= sbl.reverse();	
         
     System.out.println("Reverse no:" +rev);
	}

}
