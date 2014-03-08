package hashing;

public class HashEntry {
	
	int key;
	int value;
	
	HashEntry(int key, int value){
		
		this.key=key;
		this.value=value;
		
		
	}
	
	public int getKey(){
		
		return key;
		
	}
	
	public int getValue(){
		
		return value;
		
	}
	
	public void setValue(int value){
		
		this.value=value;
		
	}

}
