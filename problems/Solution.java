package problems;

import java.util.Scanner;

public class Solution {


	

	public static void main(String args[]){

	
		String a="The most direct computation would be for the enemy to try all 2^r possible keys, one by one.";
String b="In this letter I make some remarks on a general principle relevant to enciphering in general and my machine.";
String c="If qualified opinions incline to believe in the exponential conjecture, then I think we cannot afford not to make use of it.";
String d="We see immediately that one needs little information to begin to break down the process.";

System.out.println(a.length()+"\n"+b.length()+"\n"+c.length()+"\n"+d.length());
		
	
	}
	
	
	
	public static String xorHex(String a, String b) {
		// TODO: Validation
		char[] chars = new char[a.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = toHex(fromHex(a.charAt(i)) ^ fromHex(b.charAt(i)));
		}
		return new String(chars);
	}

	private static int fromHex(char c) {
		if (c >= '0' && c <= '9') {
			return c - '0';
		}
		if (c >= 'A' && c <= 'F') {
			return c - 'A' + 10;
		}
		if (c >= 'a' && c <= 'f') {
			return c - 'a' + 10;
		}
		throw new IllegalArgumentException();
	}

	private static char toHex(int nybble) {
		if (nybble < 0 || nybble > 15) {
			throw new IllegalArgumentException();
		}
		return "0123456789ABCDEF".charAt(nybble);
	}
	
	public static String convertHexToString(String hex){
		 
		  StringBuilder sb = new StringBuilder();
		  StringBuilder temp = new StringBuilder();
	 
		  //49204c6f7665204a617661 split into two characters 49, 20, 4c...
		  for( int i=0; i<hex.length()-1; i+=2 ){
	 
		      //grab the hex in pairs
		      String output = hex.substring(i, (i + 2));
		      //convert hex to decimal
		      int decimal = Integer.parseInt(output, 16);
		      //convert the decimal to character
		      sb.append((char)decimal);
	 
		      temp.append(decimal);
		  }
		  //System.out.println("Decimal : " + temp.toString());
	 
		  return sb.toString();
	  }
	



}
