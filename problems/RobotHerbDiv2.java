package problems;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class RobotHerbDiv2
{
	public int getdist(int T, int[] a)
	{
		
		String[] dr={"y", "x", "y", "x"};
		
		String[] sgn={"+","+","-","-"};
		
		int[] sP={0,0};
		
		int dp=0;
		
		int sp=0;
		
		
		for(int j=0; j<T;j++){
		
		for(int i: a){
			
			
			
			
			if(dr[dp]=="y" && sgn[sp]=="+"){
				
				sP[1]+=i;
				
				
			}else if(dr[dp]=="x" && sgn[sp]=="+"){
				
				
				sP[0]+=i;
				
			}else if(dr[dp]=="y" && sgn[sp]=="-"){
				
				sP[1]-=i;
				
				
			}else if(dr[dp]=="x" && sgn[sp]=="-"){
				
				
				sP[0]-=i;
				
			}
			
			
			dp=(dp+i)%4;
			sp=(sp+i)%4;
				
			
			
		}
		
		}
		
		
		return (Math.abs(sP[0])+Math.abs(sP[1]));
		
		
		
	}
		
	
	

}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!