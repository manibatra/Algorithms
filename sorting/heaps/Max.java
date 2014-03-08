package sorting.heaps;

public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] A={84, 22, 19, 10, 3, 17, 6, 5, 9};
		System.out.println(heapExtractMax(A));
		System.out.println(heapExtractMax(A));
		System.out.println(heapExtractMax(A));
		System.out.println(heapExtractMax(A));

		
		for(int i : A){
			
			if(i!=(int) -(1.0/0.0))
			System.out.print(i+" ");
			
		}
		
		
	}
	
	public static int heapMaximum(int A[]){
		
		return A[0];
		
	}
	
	public static int heapExtractMax(int[] A){
		
		if(A[0]==(int) -(1.0/0.0)){
			
			System.out.println("Heap Underflow");
			
		}
		int max=heapMaximum(A);
		A[0]=A[A.length-1];
		A[A.length-1]=(int) -(1.0/0.0);
		MaxHeapify.maxHeapify(A, 0, A.length-1);
		return max;
		
	}

}
