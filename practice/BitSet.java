package practice;

import java.text.DecimalFormat;

public class BitSet {
	
	public static void main(String args[]){
		
		
	        char[] answers = new char[1];
	        
	        int ptr = 0;
		
		for(int i =0; i < (1<<1); i ++){
			
			String test = Integer.toBinaryString(i);
			for(int j = 0; j < (answers.length - test.length()); j++){
				answers[ptr++] = 'f';
				
			}
			
			int offset = ptr;
			
			for(int j = ptr; j < answers.length; j++){
				
			if(test.charAt(ptr-offset) == '1')	
				answers[ptr++] = 't';
			else
				answers[ptr++] = 'f';
				
			}
			
			ptr = 0;
			
			System.out.println(new String(answers));
	        
	}
			
		}
			

}
