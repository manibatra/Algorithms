package practice;


public class RodCutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p={1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		System.out.println(new RodCutting().cutRod(10, p));

	}
	
	private int cutRod(int n, int[] p){
		
		if (n==0){
			
			return 0;
			
		}
		
		int q=-1;
		
		for(int i=1; i<=n ; i++){
			
			q=Math.max(q,p[i-1]+ cutRod(n-i, p) );
			
		}
		
		return q;
		
		
	}

}
