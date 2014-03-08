package practice;

public class Subsequence_Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		char[] name={'a', 'b', 'c'};

		//All the subsets
		for(int i=0; i < (1<<name.length);i++){

			char[] subset=new char[name.length];
			for(int k=0; k<name.length;k++){

				if(((1<<k) & i) != 0){

					subset[k]=name[k];

				}



			}


			System.out.println(Integer.toBinaryString(i)+"   "+new String(subset));


		}

		//Subsets with at max 2 elements
		for(int i=0; i < (1<<name.length);i=Integer.bitCount(i)<2?i+1:(i|(i-1))+1){

			char[] subset=new char[name.length];

			for(int k=0; k<name.length;k++){

				if(((1<<k) & i) > 0){

					subset[k]=name[k];

				}
			}
			System.out.println(new String(subset));
		}

	}

}
