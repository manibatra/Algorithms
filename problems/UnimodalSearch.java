package problems;

public class UnimodalSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={6,7};
		
		System.out.println(US(array, 0, array.length-1));
		
	}
	
	
	public static int US(int[] array, int p, int r ){
		
		if(p>=r){
			
			return array[p];
			
		}else{
			
			int q=(p+r)/2;
			
			if(array[q+1]<array[q]){
				
				return US(array, p, q);
				
			}else if(array[q+1]>array[q]){
				
				return US(array, q+1, r);
				
			}else{
				
				
				return array[q];
				
			}
			
			
		}
		
		
		
	}

}
