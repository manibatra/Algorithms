package problems;



public class FoxAndMp3Easy {
	
	
	public String[] playList(int n){
		
		
		String[] result=new String[50];
		
		for(int i=0; i< result.length; i++)
			result[i]="0";
		
		result[0]="1";
		
		int index=0;
		
		int high=0;
		
		for(int i=2; i<=n;i++){
			
			
			if(i<=50){
				
				high=i-2;
				
			}else{
				
				high=49;
				
			}
			
			index=BinarySearchM(result, 0, high, Integer.toString(i));
			//System.out.println("The index is "+index);
			if(index>=50)
				continue;
			if(result[index]=="0"){
			result[index]=Integer.toString(i);
			}
			else{
				
				
				
				for(int j=result.length-1; j>index; j--)
				{
					
					result[j]=result[j-1];
					
					
				}
				
				result[index]=Integer.toString(i);
				
			}
			
		}
		
		int max=0;
		
		for(String s : result){
			if(s!="0")
				max+=1;
			else
				break;
		}
		
		String[] fResult=new String[max];
		
		for(int i=0; i<max; i++){
			
			fResult[i]=result[i]+".mp3";
			
		}
		
		
		return fResult;
		
	}
	
	
	private static int BinarySearchM(String[] myArray, int low, int high, String x) {
		// TODO Auto-generated method stub
		
		if(low==high){
			
			
			
			if(x.compareTo(myArray[low])<0){
				
				//System.out.println(x+"smaller"+myArray[low]);
				
				return low;
				
			}else{
				
				//System.out.println(myArray[low]);
				//System.out.println(x+"higher"+low);
				return low+1;
				
			}
			
			
			
		}else{
		
		int mid=(low+high)/2;
		if(x.compareTo(myArray[mid])>0){
			
			return BinarySearchM(myArray, mid+1, high, x);
		}else{
			
			return BinarySearchM(myArray, low, mid, x);
		}
		
		
		
		}
		
	}
	
	
	public static void main(String args[]){
		
		
		String[] result=new FoxAndMp3Easy().playList(10);
		
		
	
	for(String s: result)
		
		System.out.println(s);
		
	}
	

}
