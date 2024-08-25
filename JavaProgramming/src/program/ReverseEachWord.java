package program;
import java.util.*;
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);	
        String str=sc.nextLine();
        
     String words[] = str.split(" ");

//     String reverseString="";
//     
//     for(String w:words)
//     {
//    	 String reverseword=" ";
//    	 for(int i=w.length()-1;i>=0;i--)
//    	 {
//    		 reverseword = reverseword+w.charAt(i); //one word reversed
//    	 }
//    	 reverseString = reverseString+reverseword+"";	 // adding the reversed word in a string.
//     }
//     System.out.println(reverseString);
     
     //Approach 2
     
     String reverseword="";
     for(String w:words)
     {
    	 StringBuilder sb = new StringBuilder(w);
    	 sb.reverse();
    	 reverseword =reverseword+sb.toString()+" ";
     }
     System.out.println(reverseword);
	}

}
