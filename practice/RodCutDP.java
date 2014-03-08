package practice;

public class RodCutDP {

	/**
	 * @param args
	 */
	
	static int r[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p={1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

		r=new int[11];
		
		r[0]=0;
		
		System.out.println(rodCutDP(10, p));

	}
	
	
	public static int rodCutDP(int n, int[] p){
		
		for(int i=1; i<=n; i++){
			int q=-1;
			for(int j=1; j<=i; j++ ){
				
				q=Math.max(q, p[i-1]+r[i-j]);
				
			}
			
			r[n]=q;
			
		}
		
		
		
		return r[r.length-1];
		
	}

}
