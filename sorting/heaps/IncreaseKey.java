package sorting.heaps;

public class IncreaseKey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int A[]={15, 13, 9, 5, 12, 8, 7, 4, 0, 6, 2, 1};
		increaseKey(A, 7, 16);
		
		for(int i : A){
			
			System.out.print(i+" ");
			
		}
		
	}
	
	public static void increaseKey(int[] A, int i, int key){
		
		if(key <= A[i]){
			
			System.out.println("The existing key is larger than the new key");
			return;
			
		}
		
		A[i]=key;
		
		while(i>0 && A[i]>A[MaxHeapify.parent(i)] ){
			
			
			int temp=A[MaxHeapify.parent(i)];
			A[MaxHeapify.parent(i)]=A[i];
			A[i]=temp;
			
			i=MaxHeapify.parent(i);
			
			
			
		}
		
		
		
	}

}
