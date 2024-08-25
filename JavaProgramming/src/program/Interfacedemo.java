package program;

interface shape
{
	int length =10; //static and final
	int width = 20;
	void circle(); //
	default void square() {
		System.out.println("Square Default method");
	}
	static void rectangle(){
		System.out.println("Rectangle static method");
	}
}



public class Interfacedemo implements shape {
   public void circle()//Using Abstract class while implementing, we can skip methods from interface. But subclass should be created to implement the skipped methods.
   {
	   System.out.println("Circle abstract method");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfacedemo ifd = new Interfacedemo();
		ifd.circle(); //abstract method
		ifd.square(); //default
		
		shape.rectangle(); //static method only be accessed by interface name.
		
		//using interface var
		shape sh = new Interfacedemo();
		sh.circle();
		
	
		
	}

}
