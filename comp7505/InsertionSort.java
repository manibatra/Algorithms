package comp7505;

public class InsertionSort {
	
	
	
	public static void main(String args[]){
		
		
		int[] test={6};
		
		sort(test);
		
		for(int x: test){
			System.out.println(x);
			
		}
		
		
	}
	
	public static void sort(int[] input){
		
		for(int i=0; i<input.length;i++){
			
			int key=input[i];
			
			int j=i-1;
			
			while(j>=0 && input[j]>key){
				
				input[j+1]=input[j];
				
				j--;
				
				
				
			}
			
			input[j+1]=key;
			
		}
		
		
		
		
	}

}
