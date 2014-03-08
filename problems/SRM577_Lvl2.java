package problems;

import java.util.Arrays;

public class SRM577_Lvl2 {

	
	public static void main(String[] args) {
		System.out.println(new SRM577_Lvl2().getProbability(new String[]{"1275 13 17 1199 577 1001 1101 483 845 196 1163 3"
				,"60 985 296 1044 917 1007 898 119 1016 23 56 1159 1"
				,"194 372 951 991 947 1053 433 1017 1011 391 110 9 2",
				"30 245 788 830 747 2 3"}));

	}
	
	
	public double getProbability(String[] ratings)
	{
		
		String array="";
		
		for(String a : ratings){
			
			array+=a;
			
		}
		
		String[] arr=array.split(" ");
		
		int[] fRate=new int[arr.length];
		
		for(int i=0; i<arr.length; i++ ){
			
			fRate[i]=Integer.parseInt(arr[i]);
			
		}
		//System.out.println(fRate.length);
		int rooms= fRate.length/20;
		
		if((fRate.length%20)!=0)
			rooms+=1;
		
		//System.out.println(fRate[0]);
		
		if(rooms==1){
			
			return 1.0;
			
		}
		
		int ourRate=fRate[0];
		int pos=0;
		
		Arrays.sort(fRate);
		
		for(int x : fRate){
			
			pos++;
			
			if(x==ourRate){
				//System.out.println("hello");
				break;
			}
			
		}
		
		pos=fRate.length-pos+1;
		
		//System.out.println(fRate[3]);
		
		System.out.println(pos+" "+rooms);
		if(pos==1)
			return 1.0;	
		if(pos<=rooms)
			return 0.0;
		
		
		return 1/(double)rooms;
	}
	

}
