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
        
        	System.out.print("enter a number Which number do you want to find in the array ");
            int find=myObj.nextInt();
        	System.out.print("First occurrence is "+firstOccurrence(array,0,find));
	}
	public static int firstOccurrence (int array[],int index,int find) {

	        if(index==array.length)
        	    return -1;
	       
	        
            if(array[index]==find)
                return index;
            else{
                int fo=firstOccurrence(array,index+1,find);
                return fo;
                
            }
    	}
}
/*
Input: 

Enter a Array size 10                                                                                                         
Enter a number 10                                                                                                             
Enter a number 20                                                                                                             
Enter a number 30                                                                                                             
Enter a number 40                                                                                                             
Enter a number 10                                                                                                             
Enter a number 50                                                                                                             
Enter a number 20                                                                                                             
Enter a number 40                                                                                                             
Enter a number 60                                                                                                             
Enter a number 30                                                                                                             
enter a number Which number do you want to find in the array 30      

Output: 

First occurrence is 2 

*/

