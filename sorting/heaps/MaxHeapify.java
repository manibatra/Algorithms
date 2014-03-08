package sorting.heaps;

public class MaxHeapify {
	
	public static void main(String[] args){
		
		int[] A={27, 17, 10, 16, 13, 9, 0, 5, 7, 12, 4, 8, 3, 1};
		
		maxHeapify(A, 6, A.length);
		
		for(int i : A){
			
			System.out.print(i+" ");
			
		}
		
	}

	public static void maxHeapify(int[] A, int i, int heapSize){
		
		int l=left(i);
		int r=right(i);
		int largest=0;
		
		if(l<heapSize && A[l]>A[i]){
			largest=l;
		}else{
			largest=i;
		}
		if(r<heapSize && A[r]>A[largest]){
			largest=r;
		}
		
		if(largest!=i){
			
			int temp=A[largest];
			A[largest]=A[i];
			A[i]=temp;
			maxHeapify(A, largest, heapSize);
			
		}
		
		
	}
	
	public static int parent(int i){
		
		return (i/2);
		
	}
	
	public static int left(int i){
		
		return ((2*i)+1);
		
	}
	
	public static int right(int i){
		
		return ((2*i)+2);
		
	}
	
}
