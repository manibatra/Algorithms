package practice;

public class LCS_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.out.println("\nLength : "+new LCS_DP().getMax("hell987798", "ooohelloo"));

	}

	public int getMax(String a, String b){

		int[][] dp=new int[a.length()+1][b.length()+1];
		String[][] ans=new String[a.length()+1][b.length()+1];

		for(int i=1; i<=a.length();i++){

			for(int j=1; j<=b.length(); j++){

				if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
					ans[i][j]="\\";
				}
				else{

					if(dp[i-1][j]>=dp[i][j-1])
					{
						dp[i][j]=dp[i-1][j];
						ans[i][j]="|";

					}else{

						dp[i][j]=dp[i][j-1];
						ans[i][j]="-";

					}


				}




			}

		}

		System.out.print("LCS : ");
		printLCS(ans,a, a.length(), b.length());


		return dp[a.length()][b.length()];

	}

	private void printLCS(String[][] ans, String a, int i, int j) {

		if(i==0 || j== 0)
			return;
		if(ans[i][j]=="\\"){
			printLCS(ans, a, i-1, j-1);
			System.out.print(a.charAt(i-1));

		}
		else if(ans[i][j]=="|")
			printLCS(ans, a, i-1, j);
		else
			printLCS(ans, a, i, j-1);

	}

}
