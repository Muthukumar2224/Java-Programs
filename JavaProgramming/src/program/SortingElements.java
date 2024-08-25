package program;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,2,1,3,4,5};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));

		
     /*  Integer a[]= {10,2,8,1,7};
       System.out.println("Array Before Sorting"+Arrays.toString(a));
       Arrays.sort(a,Collections.reverseOrder());  //Integer derived type
       System.out.println("Array After Sorting"+Arrays.toString(a)); */
	}

}
