package program;

public class EvenoddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5};
    System.out.println("Even Numbers in an array");
    
    for(int i=0;i<=a.length-1;i++)
    {
    	if(a[i]%2==0)
    	{
    		System.out.println(a[i]);
    	}
    }
    System.out.println("Odd Numbers in an array");
    for(int i=0;i<=a.length-1;i++)
    {
    	if(a[i]%2!=0)
    	{
    		System.out.println(a[i]);
    	}
    }
    
/*  System.out.println("Even Numbers in an array");
    for(int value:a)
    {
  
    if(value%2==0)
    	System.out.println(value);
    }
    System.out.println("Odd Numbers in an array");
    for(int value:a)
    {
   
    if(value%2!=0)
    	System.out.println(value);
    }*/
}
}