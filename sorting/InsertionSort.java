package sorting;

public class InsertionSort {
	
	static int count=0;
	
	public static void main(String[] args){
		
		
		int[] input={5, 2, 4, 6, 1, 3};
		
		int key=0;
		int i=0;

		
		for(int j=1; j<input.length;j++){
			
			key=input[j];
			
			i=j-1;
			
			while (i>=0 && input[i]>key){
				
				
				input[i+1]=input[i];
				i--;
				count ++;
				
				
				
			}
			
			input[i+1]=key;

			
		}
		
		
		for(int j=0; j<input.length;j++){
			
			System.out.print(input[j]+" ");
			
			
		}
		
		System.out.println("\n"+count);
		
		
		
	}
	

}
