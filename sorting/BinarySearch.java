


package sorting;

import sorting.MergeSort;

public class BinarySearch {

	
	
	public static void main(String[] args) {

		int[] input={5, 2, 3, 4};
		
		MergeSort.mergeSort(input, 0, input.length-1);
		
		int v=1;
		
		int low=0;
		int high=input.length-1;
		
//		System.out.println(BS(input, v, low, high  ));

		
		
		System.out.println(BinarySearchM(input, low, high, v));
		
	}

	private static boolean BinarySearchM(int[] myArray, int low, int high, int x) {
		// TODO Auto-generated method stub
		
		if(low==high){
			
			if(myArray[low]==x){
				
				return true;
				
			}else{
				
				System.out.println(myArray[low]);
				return false;
				
			}
			
			
			
		}else{
		
		int mid=(low+high)/2;
		if(myArray[mid]==x){
			
			return true;
			
		}else if(x>myArray[mid]){
			
			return BinarySearchM(myArray, mid+1, high, x);
		}else{
			
			return BinarySearchM(myArray, low, mid, x);
		}
		
		
		
		}
		
	}
	
	
	private static boolean BS(int[] input, int v, int low, int high) {
		
		if (low > high){
			
			return false;
			
		}
		
		int mid=(low + high)/2;
		

		
		if(input[mid] == v){
			
			
			return true;
		}
		
		if(v < input[mid]){
			
			return BS(input, v, low, mid);
			
		} else{
			
			
			return BS(input, v, mid+1, high);
			
			
		}
		
		
		
	}

}
