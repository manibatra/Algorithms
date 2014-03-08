package sorting;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] A={5, 13, 2, 25, 25, 25, 7, 17, 20, 8, 4, 9, 5, 8, 90};
		
		randomizeInPlace(A);
		
		
		
		quickSort(A, 0, A.length-1);
		
		for(int i : A){
			
			System.out.print(i+" ");
			
		}

	}
	
	public static void quickSort(int[] A, int p, int q){
		
		
		if(p<q){
			
			int r=partition(A, p, q);
			quickSort(A, p, r-1);
			quickSort(A, r+1, q);
			
			
		}
		
		
	}
	
	public static void randomizeInPlace(int[] A){
		
		for(int i=0;i<A.length;i++){
			
			int random=(int) (Math.random()*(A.length-1));
			int temp=A[i];
			A[i]=A[random];
			A[random]=temp;
			
			
		}
			
			
}

	public static int partition(int[] A, int p, int q) {

		int x=A[p];
		int i=p;
		for(int j=p+1; j<=q;j++){
			
			if(A[j]<=x){
				
				i++;
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				
			}
			
		}
		
		int temp=A[i];
		A[i]=A[p];
		A[p]=temp;
		
		
		return i;
	}
	
	
	
	
	
	

}
