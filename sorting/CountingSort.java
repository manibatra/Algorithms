package sorting;

public class CountingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] A={5, 13, 2, 25, 7, 17, 20, 8, 4, 9, 5, 8, 90};
		countingSort(A);
		

	}
	
	public static void countingSort(int[] A){
		
		int k=0;
		for(int i=0; i<A.length; i++){
			
			if(A[i]>=k){
				
				k=A[i];
				
			}
			
		}
		
		int[] C=new int[k+1];
		
		
		
		for(int i=0; i<=C.length-1; i++){
			
			C[i]=0;
			
		}
		
		
		for(int j=0;j<A.length;j++){
			
			
			C[A[j]]++;
			
			
		}
		
		for(int i=1; i < C.length; i++){
			
			
			C[i]=C[i]+C[i-1];
			
		}
		
		int[] B=new int[A.length];
		
		for(int j=A.length-1; j>=0; j--){
			
			B[C[A[j]]-1]=A[j];
			C[A[j]]--;
			
		}
		
		for(int i : B){
			
			
			System.out.print(i+" ");
			
		}
		
	}

}
