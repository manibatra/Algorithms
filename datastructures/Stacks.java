package datastructures;

public class Stacks {
	
	static int top=-1;
	
	public static void main(String args[]){
		
		int stack[]=new int[5];
		
		push(stack, 5);
		push(stack, 2);
		push(stack, 3);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		
		for(int i: stack){
			
			System.out.print(i+" ");
			
		}
		
		
		
	}
	
	
	public static void push(int[] stack, int x){
		
		if(top==stack.length-1){
			
			System.out.println("The stack is full");
			
		}else{
			
			top+=1;
			stack[top]=x;
			
		}
		
		
	}
	
	public static void pop(int[] stack){
		
		if(isEmpty(stack)){
			
			System.out.println("Stack underflow error");
			
		}else{
			
			top-=1;
			stack[top+1]=0;
			
		}
		
		
	}
	
	public static boolean isEmpty(int[] stack){
		
		if(top==-1){
			
			return true;
			
		}else{
			
			return false;
			
			
		}
		
	}

}


