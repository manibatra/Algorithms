package problems;

public class SRM578_Lvl1 {


	public static void main(String[] args) {
		
		System.out.println(new SRM578_Lvl1());

	}
	
	public int[] getminmax(int N, int K)
	{
		int[] res=new int[2];
		
		res[0]=N-K;
		
		if(res[0]<0)
			res[0]=0;
		
		if(K%2==0)
			res[1]=N-(K/2);
		else
			res[1]=N-((K/2)+1);
		
		return res;
		
	}

}
