
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
        System.out.print("Enter a number ");
        int num = myObj.nextInt(); 
        System.out.print("Enter a power ");
        int pow = myObj.nextInt(); 
		nNumber(num,pow);
	}
	public static void nNumber (int n,int pow) {
		if(pow==0){
            System.out.println(n+"^"+pow+" = "+(long)Math.pow(n, pow)+" ");
            return;
        }
        
        nNumber(n,pow-1);
        System.out.println(n+"^"+pow+" = "+(long)Math.pow(n, pow)+" ");
        
    }
}
/*
Input: 

Enter a number 2                                                                                                              
Enter a power 10

Output: 

2^0 = 1                                                                                                                         
2^1 = 2                                                                                                                         
2^2 = 4                                                                                                                         
2^3 = 8                                                                                                                         
2^4 = 16                                                                                                                        
2^5 = 32                                                                                                                        
2^6 = 64                                                                                                                        
2^7 = 128                                                                                                                       
2^8 = 256                                                                                                                       
2^9 = 512                                                                                                                       
2^10 = 1024
*/