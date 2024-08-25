package program;

public class MissingnoinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,5};
       int sum1=0;
       for(int i=0;i<a.length;i++)
       {
    	   sum1=sum1+a[i];
       }
       System.out.println("Sum of elements in an array:"+sum1);
       
       int sum2=0;
       for(int i=1;i<=5;i++)
       {
    	   sum2=sum2+i; //0+1,1+2,3+3,6+4,10+5
       }
       System.out.println("Sum of range of elements in an array:"+sum2);
       System.out.println("Missing Number:"+(sum2-sum1));
	}

}
