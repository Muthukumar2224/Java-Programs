package program;

public class sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4,5};
        int sum=0;
      /*  for(int i=0;i<=a.length-1;i++)
        {
        	sum=sum+a[i];
        }*/
        
       // Enhanced for loop
        for(int b:a)
        {
        	sum=sum+b;
        }
        
        System.out.println(sum);
	}

}
