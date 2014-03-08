package comp7505;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class RecursiveSetImplementation {

	/**
	 * @param args
	 */
	
	static HashSet<Vector<Integer>> hash=new HashSet<Vector<Integer>>();
	static int count=1;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> set=new Vector<Integer>();
		
		for(int i=1; i<=4; i++){
			
			set.add(i);
			
		}
		
		Vector<Integer> subset=new Vector<Integer>();
		
		sub((Vector<Integer>)set.clone(),subset, set.size());
		
		

	}
	
	
	@SuppressWarnings("unchecked")
	public static void sub(Vector<Integer> set, Vector<Integer> subset, int n){
		
		
		for(int i=0; i<n;i++){
			
			Vector<Integer> localSet=(Vector<Integer>) set.clone();
			Vector<Integer> localSubset=(Vector<Integer>)subset.clone();

			localSubset.add(localSet.remove(i));
			
			
			
			Collections.sort(localSubset);
			
			if(!(hash.contains(localSubset))){
				hash.add(localSubset);
			
			System.out.println(count+++"  "+localSubset.toString());
			}
			sub(localSet, localSubset, localSet.size());
			
			
			
		}
		
		
	}

}
