package practice;

public class Euclid {
	
	public int gcd(int p, int q){
		
		if(q==0){
			
			return p;
			
		}
		
		else{
			
			return gcd(q, p%q);
		}
		
	}

}
