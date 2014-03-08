package problems;

public class PowerOutage {
	
	
	static int totalTime=0;
	static int point=-1;

	
	public static void main(String[] args) {
		
		
		int[] a={0,1,0};
		int[] b={1,2,3};
		int[] c={10,10,10};
		System.out.println(new PowerOutage().estimateTimeOut(a, b, c));
				

	}
	
	public int estimateTimeOut(int[] a, int[] b, int[] c){
		
		startFromAtoB(a, b, c);
		return totalTime;
		
		
	}

	private void startFromAtoB(int[] a, int[] b, int[] c) {
		
		for(int i=0; i<a.length; i++){
			
			
			if (i!=-1){
			traverse(i, c, a, b);
			
		}
			
			
		}
		
		
	}
	
	
	private void traverse(int i, int[] c, int[] a, int[] b) {
		
		
		totalTime+=c[i];
		a[i]=-1;
		if(BinarySearchM(a, i, a.length-1, b[i])){
			System.out.println(point);
			traverse(point, c, a, b);
			
		}else{
			
			totalTime+=c[i];
			
		}
		
		
	}

	private static boolean BinarySearchM(int[] myArray, int low, int high, int x) {
		// TODO Auto-generated method stub
		
		if(low==high){
			
			if(myArray[low]==x){
				
				point=low;
				
				return true;
				
			}else{
				
				//System.out.println(myArray[low]);
				return false;
				
			}
			
			
			
		}else{
		
		int mid=(low+high)/2;
		if(myArray[mid]==x){
			
			point=mid;
			
			return true;
			
		}else if(x>myArray[mid]){
			
			return BinarySearchM(myArray, mid+1, high, x);
		}else{
			
			return BinarySearchM(myArray, low, mid, x);
		}
		
		
		
		}
		
	}

}
