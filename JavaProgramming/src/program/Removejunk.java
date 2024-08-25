package program;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123242633810e9ug1ed!@#$%^%&*&***&^$%$&&(!()*";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));

	}

}
