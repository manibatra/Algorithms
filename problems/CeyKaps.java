package problems;

public class CeyKaps {

	
	public String decipher(String input, String[] switches){
		
		for(int i=0; i<switches.length; i++){
			
			input=switchIt(i, input, switches);
			System.out.println("done");
			
			
		}
		
		return input;
		
	}
	
	private String switchIt(int i, String input, String[] switches) {
		
		String letters[]=switches[i].split(":");
		
		
		
		char old=letters[0].charAt(0);
		char newL=letters[1].charAt(0);
		
		char[] cInput=input.toCharArray();
		
		for(char c: cInput){
			
			System.out.println(c);
			
		}
		
		char[] fInput=new char[cInput.length];
		
		for(int j=0; j<cInput.length; j++){
			
			//System.out.println(cInput[i]);
			
			if(cInput[j]==old)
				fInput[j]=newL;
			
			else if(cInput[j]==newL)
				fInput[j]=old;
			
			else
				fInput[j]=cInput[j];
			
		}
		
		
		
		String changed=new String(fInput);
				//System.out.println(changed);
		return changed;
	}

	public static void main(String[] args) {
		
		

		System.out.println("Output : "+new CeyKaps().decipher("ABCDE", new String[]{"A:B","B:C","C:D","D:E","E:A"}));

	}

}
