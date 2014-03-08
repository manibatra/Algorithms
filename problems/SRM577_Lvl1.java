package problems;

public class SRM577_Lvl1 {

	
	public static void main(String[] args) {
System.out.println(new SRM577_Lvl1().getLength("eagaeoppooaaa"));
	}
	
	
	public int getLength(String nickname)
	{
		char v[]={'a', 'e','i','o','u','y'};
		
		int length=0;
		boolean flag = false;
		
		StringBuffer bf=new StringBuffer(nickname);
		
		for(int i=0; i < bf.length(); i++){
			
			
				
			
			
			for(char x : v){
				
				if(x==bf.charAt(i) && flag==false){
					flag=true;
					length++;
					
					break;
				}
				if(x==bf.charAt(i)&& flag==true){
					
					break;
					
				}
				
				
				
				
			}
			
			if(flag==false)
			length++;
			

			System.out.println(length+"  "+bf.charAt(i)+"  "+flag);
			
			
			
			
			
			
		}
		
		
		
		return length;
		
	}

}
