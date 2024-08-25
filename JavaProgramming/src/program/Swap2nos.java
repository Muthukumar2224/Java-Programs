package program;

public class Swap2nos {
 public static void main(String[] args) {
	 int a=10,b=20;
//Logic 1 using third variable
	 
//   int t=a ;
//	 a=b;
//	 b=t;

//Logic 2
	/* a=a+b;
	 b=a-b;
	 a=a-b; */

//Logic 3 here values can't be zero
//	 a=a*b;
//	 b=a/b;
//	 a=a/b;
	 
//logic 4 using XORrr
//     a=a^b;30
//     b=a^b;
//	 11110 30
//	 10100 20
//	 ------
//	 01010  10
//	 ------
//     a=a^b;   
/*	 11110 30
	 01010 10
	 ------
	 10100 20
	 ------*/
// logic 5 single statement
	 b=a+b-(a=b);
	 
	 
	 System.out.println("After Swapping:"+a+" "+b);
	 
	 
 }
}
