package problems;

public class SRM560_Lvl2 {

	
	public static void main(String[] args) {
		
		System.out.println(new SRM560_Lvl2().minDistance("qwertyuiop","potter"));

	}
	
	public int minDistance(String keyboard, String word)
	{
		
		int start=0;
		int finish=0;
		//int first=0;
		int count=0;
		for(int i=0; i < word.length(); i++){
			
			for(int j=0; j < keyboard.length(); j++){
				
				if(word.charAt(i)==keyboard.charAt(j)){
					//System.out.println(j);
					if(i==0){
						
						start=j;
						break;
					}
					else{finish=j;
					count+=Math.abs((finish-start));
					//System.out.println(count);
					start=j;
					break;
					}
					
				}
				
				
			}
			
			
		}
		
		return count;
		
		
	}
	

}
