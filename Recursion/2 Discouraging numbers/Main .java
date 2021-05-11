
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
        
    }
}
/*
Input: n = 10
Output: 10 9 8 7 6 5 4 3 2 1
*/