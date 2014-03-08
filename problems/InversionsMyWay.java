package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionsMyWay {

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	static long count=0;

	public static void main(String[] args) throws IOException{

		int noOfTestCases=Integer.parseInt(bf.readLine());
		for(int t=0; t<noOfTestCases;t++){

			int length=Integer.parseInt(bf.readLine());
			int[] myArray=new int[length];

			String[] input=bf.readLine().split(" ");

			for(int i=0; i<length;i++){

				myArray[i]=Integer.parseInt(input[i]);
			}

			mergeSort(myArray, 0, myArray.length-1);

			System.out.println(count);
			count =0;

		}
	}


	public static void mergeSort(int[] A, int p, int r) {

		if(p<r)
		{
			int q=(p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);



		}
	}

	private static void merge(int[] A, int p, int q, int r) {

		int n1=q-p+1;
		int n2=r-q;
		int[] L=new int[n1];
		int[] R=new int[n2];

		for(int i=0; i<L.length;i++){

			L[i]=A[p+i];


		}

		for(int j=0; j<R.length; j++){

			R[j]=A[q+j+1];

		}




		int i=0;
		int j=0;


		for(int k=p; k<=r; k++){

			if(i>=L.length){

				A[k]=R[j];
				j++;

			}
			else if(j>=R.length){

				A[k]=L[i];

				i++;

			}
			else if(L[i]<=R[j]){

				A[k]=L[i];

				i++;

			}
			else{

				A[k]=R[j];



				count+=n1-i;


				j++;

			}


		}

	}


}
