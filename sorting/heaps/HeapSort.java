package sorting.heaps;


public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int[] A={5, 13, 2, 25, 7, 17, 20, 8, 4, 9, 5, 8, 90};
		
		heapSort(A);
		
		for(int i : A){
			
			System.out.print(i+" ");
			
		}

		

	}
	
	public static void heapSort(int[] A){
		
		BuildMaxHeap.buildMaxHeap(A);
		
		for(int i=(A.length-1); i>0;i--){
			
			int temp=A[i];
			
			A[i]=A[0];
			A[0]=temp;
			
			MaxHeapify.maxHeapify(A, 0, i);
			
		}
		
		
	}

}
