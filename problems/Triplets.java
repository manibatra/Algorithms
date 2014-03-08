package problems;
import java.io.*;
import java.math.*;

public class Triplets {


	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {


		int length=Integer.parseInt(br.readLine());

		String input[]=br.readLine().split(" ");

		int myArray[]=new int[length];

		for(int i=0;i<myArray.length;i++){

			myArray[i]=Integer.parseInt(input[i]);

		}

		MergeSort(myArray, 0, myArray.length-1);

		int count=1;
		
		for(int i=1;i<myArray.length;i++){
			
			if(myArray[i]!=myArray[i-1]){
				
				count++;
				
			}
			
			
		}
		System.out.println(count);
		
		int result=(count*(count-1)*(count-2))/6;
		
		System.out.println(result);


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
