package program;
import java.util.*;
public class CountwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
        	if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) //if i index has space , then i+1 index should not have space
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
