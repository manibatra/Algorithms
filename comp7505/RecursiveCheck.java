package comp7505;

public class RecursiveCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test={1,2};
		
		System.out.println(check(test, 2, 0));
		
		

	}
	
	public static boolean check(int[] A, int i, int j){
		
		if(i>A.length-1)
			return false;
		
		for(int k=j+1; k<i;k++){
			if(A[j]+A[k]==A[i])
				return true;
			
		}
		
		return check(A, i+1, j+1);
		
	}

}
