package program;
import java.util.Random;
public class Generaterandomnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using random
     Random rand = new Random();
     
     int a= rand.nextInt(100);
     System.out.println(a);
     
     double b = rand.nextDouble(); //0.0 and less than 1.0
     System.out.println(b);
     
     //using math
     System.out.println(Math.random()); //decimal random
     
     //using apache commons-lang API
//     
//      String randNum = RandomStringUtils.randomNumeric(5);
//      System.out.println(randNum);
//      
//      String randStr = RandomStringUtils.randomAlphabetic(5);
     
	}

}
