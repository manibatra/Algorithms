package problems;
import java.io.*;


public class Pairs {

	/**
	 * @param args
	 */

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	static long count=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String constraints[]=br.readLine().split(" ");

		int length=Integer.parseInt(constraints[0]);
		int difference=Integer.parseInt(constraints[1]);

		int myArray[]=new int[length];

		String input[]=br.readLine().split(" ");

		for(int i=0; i<input.length;i++){

			myArray[i]=Integer.parseInt(input[i]);

		}


		MergeSort(myArray, 0, myArray.length-1);



		int newArray[]=new int[myArray.length];

		for(int i=0; i<newArray.length;i++){

			newArray[i]=myArray[i]+difference;

		}

		for(int i=0; i<newArray.length;i++){

			if(BinarySearch(myArray,0, myArray.length-1, newArray[i])){

				count++;
			}

		}

		System.out.println(count);

	}

	private static boolean BinarySearch(int[] myArray, int low, int high, int x) {
		// TODO Auto-generated method stub

		if(low==high){

			if(myArray[low]==x){

				return true;

			}else{

				return false;

			}



		}else{

			int mid=(low+high)/2;
			if(myArray[mid]==x){

				return true;

			}else if(x>myArray[mid]){

				return BinarySearch(myArray, mid+1, high, x);
			}else{

				return BinarySearch(myArray, low, mid, x);
			}

		}


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

			}else if(L[i]<=R[j]){

				myArray[k]=L[i];
				i++;

			}else{

				myArray[k]=R[j];
				j++;

			}

		}


	}



}
