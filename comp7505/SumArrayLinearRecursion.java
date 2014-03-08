package comp7505;

public class SumArrayLinearRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int sum(int[] elements, int size){
		
		if(size==1)
			return elements[0];
		else
			return elements[size-1]+sum(elements, size-1);
		
		
	}

}
