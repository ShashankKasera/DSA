import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number ");
		long fact=factorial(s.nextInt());
	}
	public static long factorial (int n) {

        	if(n==1){
            	  System.out.print(1+" ");
            	  return 1;
        	}
        
       	        long f=n*factorial(n-1);
        	System.out.print(f+" ");
        	return f;
    	}
}

/*
Input: n = 10
Output: 2 6 24 120 720 5040 40320 362880 3628800 
*/
