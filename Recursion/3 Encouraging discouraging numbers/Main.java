
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
        System.out.print("Enter a number ");
        int num = myObj.nextInt(); 
		nNumber(num);
	}
	public static void nNumber (int n) {
		if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        System.out.print(n+" ");
        nNumber(n-1);
        System.out.print(n+" ");
        
    }
}
/*
Input: n = 10
Output: 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 
*/