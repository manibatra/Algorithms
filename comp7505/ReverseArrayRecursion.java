package comp7505;

public class ReverseArrayRecursion {
	
	
	public static void main(String args[]){
		
		int[] in={1, 2, 3, 4, 5, 6};
		reverse(in, 0, in.length-1);
		
		for(int x : in){
			
			System.out.print(x+" ");
			
		}
		
	}
	
	public static void reverse(int[] in, int i, int j){
		
		if(i<j){
			
			int temp=in[i];
			in[i]=in[j];
			in[j]=temp;
			reverse(in, i+1, j-1);
			
		}
		
		
	}

}
