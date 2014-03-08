package chapter4;

public class MaximumSubArrayBruteForce {

	
	public static void main(String[] args) {

		int[] A={13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		
		int maxSum=(int)-(1.0/0.0),sum=0, i=0, j=0;
		
		for(int m=0; m< A.length;m++){
			
			sum=0;
			
			for(int n=m; n<A.length; n++){
				
				
				sum+=A[n];

				if(sum>maxSum){
					
					maxSum=sum;
					i=m;
					j=n;
					
				}
				
				
				
				
				
			}
			
			
		}
		
		System.out.println("The maximum sum is " + maxSum);
		System.out.println("It is in the sub array from position "+i+" i.e. element "+A[i]+" to position "+j+" i.e. element "+A[j]);	
		
		
	}

}
