package orderStatistics;
import sorting.QuickSort;

public class RandomSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int[] A={5, 13, 2, 25, 7, 17, 20, 8, 4, 9, 5, 8, 90};
		
		System.out.println(randomSelect(A, 0, A.length-1, 8));

		
		
	}
	
	public static int randomSelect(int[] A,int p, int r, int i){
		
		if(p==r){
			
			return A[p];
			
		}
		
		int q=QuickSort.partition(A, p, r);
		int k=q-p+1;
		if(i==k){
			
			return A[q];
			
		}
		
		if(i<k){
			
			return randomSelect(A, p, q-1, i);
			
		}else{
			
			
			return randomSelect(A, q+1, r, i-k);
			
		}
		
		
		
	}

}
