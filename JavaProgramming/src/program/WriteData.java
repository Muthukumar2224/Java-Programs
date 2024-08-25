package program;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileWriter fw = new FileWriter("C:\\Users\\2125244\\Downloads\\test.txt");
     BufferedWriter bw=new BufferedWriter(fw);
     bw.write("Test 1");
     bw.close();
	}

}
