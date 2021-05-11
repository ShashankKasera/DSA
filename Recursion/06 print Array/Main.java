
import java.util.Scanner;
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
        	printArray(array,0);
	}
	public static void printArray (int array[],int index) {

	        if(index==array.length)
        	    return;
            
        	System.out.print(array[index]+" ");
        	printArray(array,index+1);
    	}
}
/*
Input: 

Enter a Array size 10                                                                                                           
Enter a number 10                                                                                                               
Enter a number 20                                                                                                               
Enter a number 30                                                                                                               
Enter a number 40                                                                                                               
Enter a number 50                                                                                                               
Enter a number 60                                                                                                               
Enter a number 70                                                                                                               
Enter a number 80                                                                                                               
Enter a number 90                                                                                                               
Enter a number 100       

Output: 

10 20 30 40 50 60 70 80 90 100

*/