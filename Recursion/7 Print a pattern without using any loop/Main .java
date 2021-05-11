
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
        	System.out.print("Enter a number ");
        	int num = myObj.nextInt(); 
		pattern(num);
	}
	public static void pattern (int n) {
		if(n<=0){
            	   System.out.print(n+" ");
            	   return;
        	}
        
        	System.out.print(n+" ");
        	pattern(n-5);
        	System.out.print(n+" ");
    	}
}
/*

Input: n = 16
Output: 16, 11, 6, 1, -4, 1, 6, 11, 16

Input: n = 10
Output: 10, 5, 0, 5, 10

*/