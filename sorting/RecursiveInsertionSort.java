package sorting;

public class RecursiveInsertionSort {
	
	public static void main(String[] args){
		
		
		int[] input={5, 2, 4,7, 1, 3,0, 12, 78, 99, 111, 2,9, 8, 3, 4,  6, 5};
		
		RS(input, input.length);
		
		for(int j=0; j<input.length;j++){
			
			System.out.print(input[j]+" ");
			
			
		}
		
		
		
	}

	private static void RS(int[] A, int n) {
		
		if (n > 1){
		
		   RS(A, n-1);
		   Sort(A, n);
		   
		   
		}
		
	}

	private static void Sort(int[] A, int n) {
		
		int key=A[n-1];
		
		int i=n-2;
		
		while(i >=0 && A[i] > key ){
			
			A[i+1]=A[i];
			i--;
			A[i+1]=key;
			
		}
		
	}

}
