import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
        	System.out.print("Enter a Array size ");
        	int size=myObj.nextInt();
        	int []array=new int [size];
        
        	for(int i=0;i<size;i++){
        	
            		System.out.print("Enter a number ");
            		array[i]=myObj.nextInt();
        	}
        
        	System.out.println();
        	System.out.print("Array of max is "+maxArray(array,0));
	}
	public static int maxArray (int array[],int index) {

	        if(index==array.length){
        	    return 0;
	        }
            int max=Math.max(array[index], maxArray(array,index+1));
        	return max;
    	}
}
/*
Input: 

Enter a Array size 10                                                                                                         
Enter a number 65                                                                                                             
Enter a number 97                                                                                                             
Enter a number 35                                                                                                             
Enter a number 85                                                                                                             
Enter a number 87                                                                                                             
Enter a number 4                                                                                                              
Enter a number 13                                                                                                             
Enter a number 64                                                                                                             
Enter a number 81                                                                                                             
Enter a number 87    

Output: 

Array of max is 97 

*/

