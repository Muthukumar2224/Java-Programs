package program;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[] = {1,2,3,4,5,6}; //Should be in sorted order
     int key =2; // Searchable element
   
     int l=0;// l -lower , h - higher value
     int h=a.length-1; //consider index value so -1 //length returns general count 
     boolean flag = false;
     while(l<=h)
     {                        // For key = 5              // For Key=2
    	 int mid = (l+h)/2;  //0+5/2=3(mid) //4+5/2=4 		//0+5/2=3       //0+2/2=1
    	 if(a[mid]==key)    //a[3]!=5       //a[4]=5                        //a[1]==2
    	 {
    		 System.out.println("Element Found");
    		 flag= true;
    		 break;
    	 }
    	 if(key>a[mid])//a[3]=4 //5>4            //2 not greater than a[3]
    	 {
    		 l=mid+1;//l=4
    	 }
    	 if(key<a[mid])                           //a[3]=4          //2<4
    	 {
    		 h=mid-1;                                    //h=3-1=2
    	 }
     }
     if(flag==false)
     {
    	 System.out.println("Element not found");
     } 
  
     //Approach 2
   //Arrays.binarySearch(array variable,searching value);
     
//     
//   System.out.println(Arrays.binarySearch(a,3));
     }
	}




