package problems;

public class SRM559_Lvl2 {

	
	public static void main(String[] args) {
		
		
		System.out.println(new SRM559_Lvl2().countCells(2, 1, 8, 8, 4));
		
		//System.out.println((255 & 256)==255);
		
		
	}
	
	public long countCells(int a, int b, int numRows, int numColumns, int k)
	{
		
		long[] dx={a, a, -a, -a, b, b, -b, -b};
		long[] dy={b, -b, b, -b, a, -a, a, -a};
		
		
		long result=0;
		
		long exactly[]=new long[256];
		
		for(int mask=255; mask>=0; mask--){
			
			long n=0;
			
			long valid=0;
			
			long left=0, right=0, up=0, down=0;
			
			for(int i=0; i<8; i++){
				
				if((mask & (1<<i)) > 0){
					
					n++;
					if(dx[i]<0){
						
						left=Math.max(left, -dx[i]);
						
					}else{
						
						right=Math.max(right, dx[i]);
						
					}
					
					if(dy[i]<0){
						
						up=Math.max(up, -dy[i]);
						
					}else{
						
						down=Math.max(down, dy[i]);
						
					}
					
					
				}
				
			}
			
			valid=(numRows-left-right)*(numColumns-up-down);
			
			exactly[mask]=valid;
			
			for(int mask2=mask+1; mask2<256;mask2++){
				
				if((mask & mask2)==mask)
					exactly[mask]-=exactly[mask2];
				
			}
			
			if(n==k)
				result+=exactly[mask];
			
			
			
			
		}
		
		return result;
		
		
		
		
		
	}

}
