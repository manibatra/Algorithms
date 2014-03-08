package sorting.heaps;
import sorting.heaps.MaxHeapify;

public class BuildMaxHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] A={5, 3, 17, 10, 84, 19, 6, 22, 9};
		
		buildMaxHeap(A);
		
		for(int i : A){
			
			System.out.print(i+" ");
			
		}

	}
	
	public static void buildMaxHeap(int[] A){
		
		for(int i=((A.length/2)-1); i>=0;i--){
			
			MaxHeapify.maxHeapify(A, i, A.length);
			
		}
		
	}

}
