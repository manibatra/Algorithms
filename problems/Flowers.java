package problems;

import java.util.Scanner;



public class Flowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
	      
	      int N, K;
	      N = in.nextInt();
	      K = in.nextInt();
	      
	      int C[] = new int[N];
	      for(int i=0; i<N; i++){
	         C[i] = in.nextInt();
	      }
		
		MergeSort(C, 0, C.length-1);
		
		int q=0;
		int cost=0;
		for(int i=0; i<C.length;i++){
			
			q=i/K;
			
			cost+=(q+1)*C[i];
			
			
		}
		
		

		
		System.out.println(cost);
		

	}
	
	private static void MergeSort(int[] myArray, int p, int r) {

		if(p<r){

			int q=(p+r)/2;

			MergeSort(myArray, p, q);
			MergeSort(myArray, q+1, r);
			Merge(myArray, p, q, r);

		}
	}

	private static void Merge(int[] myArray, int p, int q, int r) {


		int n1=q-p+1;
		int n2=r-q;

		int L[]=new int[n1];
		int R[]=new int[n2];

		for(int i=0; i<L.length;i++){

			L[i]=myArray[p+i];

		}


		for(int j=0; j<R.length; j++){

			R[j]=myArray[q+j+1];

		}

		int i=0,j=0;


		for(int k=p; k<=r;k++){

			if(i>=L.length){
				myArray[k]=R[j];
				j++;

			}else if(j>=R.length){

				myArray[k]=L[i];
				i++;

			}else if(L[i]>R[j]){

				myArray[k]=L[i];
				i++;

			}else{

				myArray[k]=R[j];
				j++;

			}

		}


	}


}
