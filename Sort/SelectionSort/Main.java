import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		System.out.print("Enter Array size ");
		Scanner scn = new Scanner(System.in);  
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
		nums=selectionSort(nums,size);
		System.out.println("sorted");
		for(int a:nums){
		  System.out.print(a+" ");   
		}
	}
	
	public static int[] selectionSort(int nums[],int n){
	    
	    for(int i=0;i<n-1;i++){
	        
	        int min=i;
	        for(int j=i+1;j<n;j++){
	            if(nums[min]>nums[j])
	               min=j;
	        }
	        if(min!=i){
	            int temp=nums[min];
	            nums[min]=nums[i];
	            nums[i]=temp;
	        }
	    }
	    return nums;
	    
	}
}
