package practice;

import java.util.Arrays;

public class RodCuttingMemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p={1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		
		int[] r=new int[p.length+1];
		Arrays.fill(r, -1);
	
		System.out.println(rodCutMemo(10, p, r));


	}

	public static int rodCutMemo(int n, int[] p, int[] r){
		
		if (r[n]>=0){
			
			return r[n];
		}
		
		int q=0;
		
		if (n==0){
			q=0;
			
		}
		else{
		
		 q=-1;
		
		for(int i=1; i<=n; i++){
			
			q=Math.max(q, p[i-1]+rodCutMemo(n-i, p, r) );
			
		  }
		}
		r[n]=q;
		
		return q;
		
	}
	
}
