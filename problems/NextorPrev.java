package problems;

import java.util.Arrays;

public class NextorPrev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new NextorPrev().getMinimum(10, 1, 
				"zyxw",
				"vuts"
				));



		


	}

	public int getMinimum(int nextCost, int prevCost, String start, String goal){

		char[] st=start.toCharArray();
		char[] gl=goal.toCharArray();
		int totalCost=0;

		char max = 0;
		int index=-1;


		for(int j=0;j<st.length;j++){

			max=0;


			for(int i=0; i< st.length; i++){

				if(st[i]>max && st[i]!=0){
					max=st[i];
					index=i;

				}

			}

			System.out.println(st[index]);



			if(gl[index]>max)
			{
				st[index]=0;
				while(max!=gl[index]){


					

					max+=1;
					totalCost+=nextCost;
					
					char temp=gl[index];
					gl[index]=0;
					
					if(Arrays.binarySearch(gl, max)>=0){

						return -1;

					}

					gl[index]=temp;
				}
				
				





			}else if(gl[index]<max){

				//System.out.println("in here");

				while(max!=gl[index]){

					st[index]=0;



					max-=1;
					//System.out.println(st[index]);

					totalCost+=prevCost;
					char temp=gl[index];
					gl[index]=0;
					if(Arrays.binarySearch(gl, max)>=0){

						return -1;

					}
					
					gl[index]=temp;
				}
				
				

				


			}else{

				return -1;

			}

		}

		return totalCost;

	}







}


