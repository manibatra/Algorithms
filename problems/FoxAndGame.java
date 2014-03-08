package problems;

public class FoxAndGame {

	/**
	 * @param args
	 */
	
	
	public int countStars(String[] result){
		
		
		int stC=0;
		
		for(int i=0; i<result.length; i++){
			
			char[] st=result[i].toCharArray();
			
			for(char c : st){
				
				if(c=='o')
					stC+=1;
				
			}
			
			
		}
		
		return stC;
		
	}

}
