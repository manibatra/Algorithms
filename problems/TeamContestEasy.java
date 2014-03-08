package problems;

import java.util.Arrays;

public class TeamContestEasy {

	
	public int worstRank(int[] strength){
		
		if(strength.length<=3)
			return 1;
		
		int min=0;
		
		min=Math.min(Math.min(strength[0],strength[1]), strength[2]);
		
		
		
		int myStrength=strength[0]+strength[1]+strength[2]-min;
		
		System.out.println("My strength "+myStrength);
		
		strength[0]=-1;
		strength[1]=-1;
		strength[2]=-1;
		
		Arrays.sort(strength);
		
		
		
		int count=1;
		
		
		for(int i=3; i<strength.length; i++){
			
			for(int j=strength.length-1; j>=4; j--){
				if(i==j || strength[j]==-1 || strength[i]==-1)
					continue;
				int ttStrength=strength[i]+strength[j];
				
				
				
				if (ttStrength>myStrength){
					System.out.println("Their strength "+ttStrength+" team positions :"+i+" ,"+j);
					count+=1;
					min=1000000000;
					int index=0;
					
					
					
					
					
					strength[i]=-1;
					
					strength[j]=-1;
					
					for(int k=0; k<strength.length;k++){
						
						if(strength[k]<min&&strength[k]!=-1)
						{
							min=strength[k];
							index=k;
						}
							
					}
					
					System.out.println("Min value is "+min+" with index "+index);
					
					strength[index]=-1;
					
					
					
					for(int m: strength){
						
						System.out.print(m+" ");
						
					}
					
				}
				
			}
			
		}
		
		
		
		return count;
		
	}
	
	public static void main(String args[]){
		
		System.out.println(new TeamContestEasy().worstRank(new int[]{1451, 649182, 51530, 826168, 849383, 179813, 945142, 378184, 622671, 216394, 782681, 246000, 797833, 105989, 459358, 905027, 284299, 852913, 487048, 746247, 497385}
));
		
	}
	
	
}
