package program;

public class CountcharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s= "safqtw ftsfgwfftfagg";
    int totalcount =s.length();
    
    //System.out.println(totalcount);
   // String totalcount_afterremove =s.replace("f","");
    //System.out.println(totalcount_afterremove.length());
    
   int totalcount_afterremove =s.replace("f","").length();
    System.out.println("No of occurence of 'f' in a string is: "+(totalcount-totalcount_afterremove));
    
	}

}
