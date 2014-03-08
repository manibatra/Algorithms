package chapter4;

public class maximumSubArray {
	
	static int globalI=0;
	static int globalJ=0;

	public static void main(String[] args){
		
		
		int[] A={1, 2, 3, 1, 6, 10};
		

		int maxSum=FindMaxSubArray(A, 0, A.length-1);
		
		System.out.println("The maximum sum is " + maxSum);
		System.out.println("It is in the sub array from position "+globalI+" i.e. element "+A[globalI]+" to position "+globalJ+" i.e. element "+A[globalJ]);
		
		
		
		
	}

	private static int FindMaxSubArray(int[] A, int low, int high) {

		
		
		if(high==low){
			globalI=low;
			globalJ=high;
			return A[low];
			
			
		}
		
		else{
			
			int mid=(low + high)/2;
			
			int leftSum=FindMaxSubArray(A, low, mid);
			
			int leftLow=globalI;
			int leftHigh=globalJ;
			
			int rightSum=FindMaxSubArray(A, mid+1, high);
			
			int rightLow=globalI;
			int rightHigh=globalJ;
			
			int  crossSum=FindMaxCrossingArray(A, low, mid, high);
			
			int crossLow=globalI;
			int crossHigh=globalJ;
			
			if(leftSum>=rightSum && leftSum>=crossSum){
				
				globalI=leftLow;
				globalJ=leftHigh;
				
				return leftSum;
				
			}else if(rightSum>=leftSum && rightSum>=crossSum){
				
				globalI=rightLow;
				globalJ=rightHigh;
				
				return rightSum;
				
			}else {
				
				globalI=crossLow;
				globalJ=crossHigh;
				
				return crossSum;
				
				
			}
			
			
			
			
		}
		
		
	}

	private static int FindMaxCrossingArray(int[] A, int low, int mid, int high) {

		int leftSum=(int) -(1.0/0.0);
		int sum=0;
		int maxLeft=0, maxRight=0;
		
		for(int i=mid; i>=0;i--){
			
			sum+=A[i];

			if(sum>leftSum){
				
				leftSum=sum;
				maxLeft=i;
				
			}
			
		}
		
		int rightSum=(int) -(1.0/0.0);
		sum =0;
		
		for(int i=mid+1; i<=A.length-1;i++){
			
			sum+=A[i];

			if(sum>rightSum){
				
				rightSum=sum;
				maxRight=i;
				
			}
			
			
		}
		
		globalI=maxLeft;
		globalJ=maxRight;
		
		return (leftSum+rightSum);
		
	}
	
	
}
