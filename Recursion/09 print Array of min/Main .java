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
        	System.out.print("Array of min is "+minArray(array,0));
	}
	public static int minArray (int array[],int index) {

	        if(index==array.length-1){
        	    return array[index];
	        }
            	int min=Math.min(array[index], minArray(array,index+1));
        	return min;
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

Array of min is 4 

*/

