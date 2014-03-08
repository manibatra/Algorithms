package datastructures;

public class Queues {

	static int head=0;
	static int tail=0;
	
	public static void main(String[] args) {
		
		int Queue[]=new int[15];
		
		enqueue(Queue, 2);
		enqueue(Queue, 4);
		enqueue(Queue, 5);
		
		System.out.println("Removed : "+dequeue(Queue));
		System.out.println("Removed : "+dequeue(Queue));
		
		enqueue(Queue, 7);
		enqueue(Queue, 9);
		
		for(int i : Queue){
			
			System.out.print(i+" ");
			
		}
		
		

	}
	
	
	public static void enqueue(int[] Q, int x){
		
		Q[tail]=x;
		if (tail==Q.length-1)
				tail=0;
		else
			tail+=1;
		
		
		
		
	}
	
	public static int dequeue(int[] Q){
		
		int x=Q[head];
		Q[head]=0;
		if (head==Q.length-1)
			head=0;
		else
			head+=1;
		
		return x;
	}
	

}
