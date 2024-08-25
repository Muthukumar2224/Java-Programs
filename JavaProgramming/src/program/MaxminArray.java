package program;

public class MaxminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {10,200,40,30,50};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
			 max=a[i];	
			}
			
		}
		System.out.println(max);
	int b[]= {10,200,40,30,50};
	int min=b[0];
	for(int i=1;i<b.length;i++)
	{
		if(b[i]<min)
		{
		 min=b[i];	
		}
	}
	System.out.println(min);
	}

}
