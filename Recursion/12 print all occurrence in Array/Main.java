import java.util.*;
public class Main
{
    private static List<Integer> list=new ArrayList<Integer>();;
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
        	System.out.print("Enter a Array size ");
        	int size=myObj.nextInt();
        	int []array=new int [size];
        
        	for(int i=0;i<size;i++){
            		System.out.print("Enter a number ");
            		array[i]=myObj.nextInt();
        	}
        
        	System.out.print("Enter a number Which number do you want to find in the array ");
            	int find=myObj.nextInt();
            	allOccurrence(array,0,find);
        	System.out.print("All occurrence "+list);
	}
	public static void allOccurrence (int array[],int index,int find) {

	        if(index==array.length)
        	    return;

                if(array[index]==find)
                    list.add(index);
         
                allOccurrence(array,index+1,find);  
    	}
}
/*
Input: 

Enter a Array size 10                                                                                                           
Enter a number 10                                                                                                               
Enter a number 20                                                                                                               
Enter a number 30                                                                                                               
Enter a number 20                                                                                                               
Enter a number 10                                                                                                               
Enter a number 30                                                                                                               
Enter a number 40                                                                                                               
Enter a number 30                                                                                                               
Enter a number 50                                                                                                               
Enter a number 90                                                                                                               
Enter a number Which number do you want to find in the array 30      

Output: 

All occurrence [2, 5, 7] 

*/

