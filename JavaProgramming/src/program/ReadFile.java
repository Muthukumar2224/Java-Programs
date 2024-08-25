package program;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.util.*;
public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Approach 1
		
 /*     FileReader fr = new FileReader("C:\\Users\\2125244\\Downloads\\test.txt");
      BufferedReader br = new BufferedReader(fr);
      String str;
      while((str=br.readLine())!=null)
     {
  	  System.out.println(str);
     }*/
		//Approach 2
		File file = new File("C:\\Users\\2125244\\Downloads\\test.txt");
		Scanner sc = new Scanner(file);
	/*	while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3
		sc.useDelimiter("\\Z");  //read every line in the file
		System.out.println(sc.next());
		
		
	}

}
