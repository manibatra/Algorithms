package sorting;

public class BinaryAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] A={1, 1, 1};
		int[] B={1, 1, 0};
		
		int[] C=new int[A.length+1];
		
		int sum, over=0;
		
		for(int j=A.length-1; j>=0; j--){
			
			
			sum=0;
			sum=A[j]+B[j]+over;
			
			if(sum==2){
				
				sum=0;
				over=1;
				
			}
			
			if(sum==3){
				
				sum=1;
				over=1;
				
			}
			
			C[j+1]=sum;
			
			
		}
		
		C[0]=over;
		
		for(int j=0; j<C.length;j++){
			
			
			System.out.print(C[j]+" ");
			
		}

		
		
	}
	

}
