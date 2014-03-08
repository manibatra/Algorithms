package problems;

public class SRM559_Lvl1 {

	
	public static void main(String[] args) {
		

	}
	
	public int getTallest(int[] blockHeights)
	{
		
		int tH=0;
		int n=blockHeights.length;
		
		
		for(int limit=0; limit<=n; limit++){
			
			
			
			int h = 0;
			
			for(int i=0; i<limit;i++){
				
				if(blockHeights[i]%2==0)
					h+=blockHeights[i];
				
			}
			
			for(int i=limit; limit<n;i++){
				
				if(blockHeights[i]%2!=0)
					h+=blockHeights[i];
				
				
			}
			
			tH=Math.max(tH, h);
			
			
		}
		
		return tH;
		
		
	}
	
	

}
