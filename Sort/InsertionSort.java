import java.util.Scanner;
public class InsertionSort
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
		nums=insertionSort(nums,size);
		System.out.println("sorted");
		for(int a:nums){
		  System.out.print(a+" ");   
		}
	}
	
	public static int[] insertionSort(int nums[],int n){
	    
	    for(int i=1;i<n;i++){
	        
	        int temp=nums[i];
	        int j=i-1;
	        while(j>=0 && temp<nums[j]){
	            nums[j+1]=nums[j];
	            j--;
	        }
	        nums[j+1]=temp;
	    }
	    return nums;
	    
	}
}
