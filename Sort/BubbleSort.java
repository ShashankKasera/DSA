import java.util.Scanner;
public class BubbleSort
{
	public static void main(String[] args) {
	    
		System.out.print("Enter Array size ");
		Scanner scn = new Scanner(System.in);  // Create a Scanner object
        int size=scn.nextInt();
		int []nums=new int [size];
		
		for(int i=0;i<size;i++){
		    System.out.print("Enter a Number ");
		    nums[i]=scn.nextInt();
		}
		System.out.println("Unsorted");
		for(int a:nums){
		  System.out.print(a+" ");   
		}
		
		System.out.println();
		nums=bubbleSort(nums,size);
		
		System.out.println("sorted");
		for(int a:nums){
		  System.out.print(a+" ");   
		}
	}
	
	public static int[] bubbleSort(int nums[],int n){
	    
	    for(int i=0;i<n;i++){
	        
	        boolean sorted=false;
	        
	        for(int j=0;j<n-1-i;j++){
	            
	            if(nums[j+1]<nums[j]){
	                int temp=nums[j];
	                nums[j]=nums[j+1];
	                nums[j+1]=temp;
	                sorted=true;
	            }
	        }
	        if(!sorted)
	          break;
	    }
	    return nums;
	    
	}
}
