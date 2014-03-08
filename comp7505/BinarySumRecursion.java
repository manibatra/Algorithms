package comp7505;

public class BinarySumRecursion {
	
	
	public static void main(String args[]){
		
		int[] in={1, 2, 3, 4};
		System.out.print(new BinarySumRecursion().sum(in, 0, in.length));
		
		
		
	}
	
	public int sum(int[] in, int i, int size){
		
		
		if(size==1)
			return in[i];
		
		return sum(in, i, (int)Math.ceil((double)size/2)) + sum(in, i + (int)Math.ceil((double)size/2), size/2 );
			
		
		
	}

}
