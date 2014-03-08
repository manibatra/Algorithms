package problems;

import java.util.Arrays;

public class SRM562 {


	public static void main(String[] args) {

		System.out.println(new SRM562());
	}

	public int maxCities(int total, int[] d)
	{
		
		Arrays.sort(d);
		int sum=0;
		int count=0;
		for(int i=0; i<d.length; i++){
			
				
			sum+=d[i];
			count++;
			
			
			if(sum>total){
				count-=1;
				break;
			}
			
			
			
			
		}
		
		
		return count;
		
	}


}
