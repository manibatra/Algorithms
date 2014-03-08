package sorting;
public class MergeSort {
	
	
	static int count=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] A={5, 2, 4, 6, 1, 3};
		
		mergeSort(A, 0, A.length-1);
		for(int i=0; i<A.length; i++){
			
			
			System.out.print(A[i]+" ");
			
			
		}
		
		System.out.println();
		
		System.out.println(count);
			
			
			
		
		

	}

	public static void mergeSort(int[] A, int p, int r) {

		if(p<r)
		{
			int q=(p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
			
			
			
		}
	}

	private static void merge(int[] A, int p, int q, int r) {
		
		int n1=q-p+1;
		int n2=r-q;
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0; i<L.length;i++){
			
			L[i]=A[p+i];
			
			
		}
		
		for(int j=0; j<R.length; j++){
			
			R[j]=A[q+j+1];
			
		}
		
		
		 
		
		int i=0;
		int j=0;
		

		for(int k=p; k<=r; k++){
			
			if(i>=L.length){
				
				A[k]=R[j];
				j++;
				
			}
			else if(j>=R.length){
				
				A[k]=L[i];

				i++;
				
			}
			else if(L[i]<=R[j]){
				
				A[k]=L[i];

				i++;
				
			}
			else{
				
				A[k]=R[j];
				
				System.out.println("here" + n1);

               count+=n1-i;
				
				
				j++;
				
			}
			
			
		}
		
   
    
		
		
	}

}
