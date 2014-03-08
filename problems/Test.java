package problems;

import java.util.Arrays;
import java.util.Collections;

public class Test {




	int minSteps=1000000000;



	public int minimumMoves(int A, int B)
	{

		rec(A,B,0,0);

		if(this.minSteps!=1000000000){

			return this.minSteps;

		}else{

			return -1;
		}

	}



	private void rec(int A, int B,int steps, int copy) {


		if(A==B){

			this.minSteps=Math.min(this.minSteps, steps);

		}else if(copy != reverse(A) && A>9){

			rec(A/10, B, steps+1, A);

			rec(reverse(A), B, steps+1, A);


		}else if(A>9){

			rec(A/10, B, steps+1, A);
		}


	}


	private int reverse(int number){
		int reverse = 0;
		int remainder = 0;
		do{
			remainder = number%10;
			reverse = reverse*10 + remainder;
			number = number/10;

		}while(number > 0);

		return reverse;
	}



	public static void main(String args[]){

		System.out.println(new Test().minimumMoves(5162, 16));

	}


}
