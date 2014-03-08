package problems;


public class Chopsticks
{
	public int getmax(int[] length)
	{


		int total=0;	
		int current=0;
		for(int i=0; i< length.length; i++){

			int st=length[i];
			if(st==-1)
				continue;

			

			for(int j=0; j< length.length; j++){

				

				if(st==length[j]){
					current++;
					length[j]=-1;
				}
				
				
				
					
				

			}
			
			current=current/2;

			total+=current;
			current=0;

		}

		return total;

	}


	public static void main(String args[]){
		
		
		System.out.println("total "+new Chopsticks().getmax(new int[]{1,2,3,2,1,2,3,2,1}));
		
	}


}