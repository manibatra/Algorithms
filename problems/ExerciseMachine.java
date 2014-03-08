package problems;

import java.io.ObjectInputStream.GetField;

public class ExerciseMachine {

	static int count=0;


	public static void main(String args[]){



		System.out.println(new ExerciseMachine().getPercentages("22:07:30"));

	}

	public int getPercentages(String time){


		int seconds=getSeconds(time);
		getFactor(seconds);
		return count;


	}

	private void getFactor(int seconds) {
		
		System.out.println(seconds);
		
		double percent=0;
		for(int i=1; i<100; i++){
			
			percent=((seconds/100.000)*i);
			System.out.println(percent);
			
			if((int)percent==percent){
				System.out.println(i);
				count=(int)(seconds/percent)-1;
				
			}

		}




	}

	private boolean checkIfPrime(int i) {

		for(int j=2;j<i;j++){

			if(i%j==0){

				return false;
			}

		}

		return true;
	}

	private int getSeconds(String time) {

		int hours=Integer.parseInt(time.substring(0, 2));
		int minutes=Integer.parseInt(time.substring(3, 5));
		int seconds=Integer.parseInt(time.substring(6));

		int totalTime=(hours*60)+(minutes*60)+seconds;

		return totalTime;
	}


}
