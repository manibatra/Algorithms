package problems;

import java.util.Arrays;

public class SRM560_Lvl1 {




	public static void main(String[] args) {

		System.out.println(new SRM560_Lvl1().minKeystrokes(new int[]{719, 916, 19, 347, 404, 419, 685, 179, 745, 691, 979, 783, 389, 566, 156, 545, 956, 41, 966, 706, 390, 401, 623, 752, 754, 667, 66, 398, 594, 46, 577, 286, 189, 128, 763, 575, 756, 591, 606, 719, 21, 125, 155, 929, 638, 184, 324, 806}, new int[]{8, 2, 7, 1, 1, 4, 9, 4, 9, 8, 10, 2, 8, 6, 5, 2, 1, 8, 10, 3, 3}));

	}


	public int minKeystrokes(int[] frequencies, int[] keySizes)
	{

		Arrays.sort(frequencies);
		int strokes=0;
		int ptrF=frequencies.length-1;
		int ptrK=0;
		int round=1;
		int sum=0;


		for(int i=0; i<keySizes.length; i++ ) sum+=keySizes[i];


		if(sum<frequencies.length)
			return -1;

		while(ptrF>=0){
			while(keySizes[ptrK]<round)
				ptrK++;
			System.out.println(ptrK);

			strokes+=frequencies[ptrF]*round;
			ptrF--;
			ptrK++;
			if(ptrK>(keySizes.length-1)){ ptrK=0; round++;}

}
		return strokes;

	}

}
