package program;

import java.util.Arrays;

public class Bubbelsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {10,2,30,12,9};
     System.out.println("Array Before Sorting"+Arrays.toString(a));
     int n=a.length;
     for(int i=0;i<n-1;i++)      //no of pass
     {
    	 for(int j=0;j<n-1;j++)  //compare and swap for loop in each pass
    	 {
    		 if(a[j]>a[j+1])
    		 {
    			 int temp = a[j];
    			 a[j]=a[j+1];
    			 a[j+1]=temp;
    		 }
    	 }
     }
     System.out.println("Array After Sorting:" +Arrays.toString(a));
	}

}
