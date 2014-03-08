package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.Vector;

import datastructures.Stacks;

public class SRM562_Lvl2 {



	public static void main(String args[]){

		System.out.println(new SRM562_Lvl2().minRepaintings(new int[]{100},"L",new int[]{1,2,3,4,5}));
		System.out.println(Integer.MAX_VALUE);

	}



	public int minRepaintings(int[] balloonCount, String balloonSize, int[] maxAccepted)
	{
		//int t=maxAccepted.length;
		int best=1000000000;
		Vector<Integer> largeCount=new Vector<Integer>();
		Vector<Integer> mediumCount=new Vector<Integer>();


		for(int i=0; i< balloonSize.length(); i++){

			if(balloonSize.charAt(i)=='L')
				largeCount.add(balloonCount[i]);
			else
				mediumCount.add(balloonCount[i]);


		}


		Collections.sort(largeCount, Collections.reverseOrder());
		Collections.sort(mediumCount, Collections.reverseOrder());


		for(int mask=0; mask < (1<<maxAccepted.length); mask++){


			Vector<Integer> largeNeed=new Vector<Integer>();
			Vector<Integer> mediumNeed=new Vector<Integer>();


			for(int i=0; i < maxAccepted.length; i++){


				if((mask & (1<<i))==0)
					largeNeed.add(maxAccepted[i]);
				else
					mediumNeed.add(maxAccepted[i]);

			}

			int r1=subProblem(mediumCount, mediumNeed);
			int r2=subProblem(largeCount, largeNeed);

			best=Math.min(best, r1+r2);


		}


		return (best==1000000000) ? -1:best;




	}



	private int subProblem(Vector<Integer> available,
			Vector<Integer> required) {

		int cost=1000000000;
		Collections.sort(required, Collections.reverseOrder());

		int totalAvailable=0;
		int totalRequired=0;

		for(int i=0; i<available.size(); i++) totalAvailable+=available.get(i);
		for(int i=0; i<required.size(); i++) totalRequired+=required.get(i);

		if(totalRequired>totalAvailable)
			return cost;

		cost=0;

		for(int i=0; i<required.size(); i++){

			if(i>available.size()-1)
				cost+=required.get(i);
			else if(required.get(i)>available.get(i))
				cost+=required.get(i)-available.get(i);


		}
		
		//System.out.println(cost);


		return cost;
	}

}
