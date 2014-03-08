package datastructures;

public class Lists {
	
	Node head, tail, current;
	int size;
	
	public Lists(){
		
		this.current=this.head=this.tail=null;
		this.size=0;
	}
	
	public int size(){
		
		return this.size;
		
	}
	
	
	public boolean isEmpty(){
		
		return (this.size==0);
		
	}
	
	
	public int currentData(){
		
		if(this.isEmpty()){
			
			throw new NullPointerException("No elements are present in the list");
			
		}else{
			
			return this.current.getData();
			
		}
		
		
	}
	
	
	public void moveNext(){
		
		if(this.isEmpty()){
			
			throw new NullPointerException("No elements are present in the list");
			
		}else if(this.current.next!=null){
			
			this.current=this.current.next;
			
		}
		
		
	}
	
	public void movePrev(){
		
		if(this.isEmpty()){
			
			throw new NullPointerException("No new elements are present in the list");
			
		}else if(this.current.prev!=null){
			
			this.current=this.current.prev;
			
		}
	}
	
	
	public boolean find(int itemToFind){
		
		boolean ret=false;
		if(!(this.isEmpty())){
			
			Node temp=this.head;
			
			while(temp.next!=null){
				
				if(itemToFind==temp.getData()){
					
					this.current=temp;
					
				}
				
				temp=temp.next;
				
			}
			
		}
		
		return ret;
		
	}
	
	public void insert(int itm){
		
		Node item=new Node(itm);
		
		if(this.isEmpty()){
			
			this.head=this.tail=this.current=item;
			
		}else if(this.current==this.tail){
			
			this.current.next=item;
			item.prev=this.current;
			this.tail=item;
			
			
		}else{
			
			item.next=this.current.next;
			this.current.next.prev=item;
			item.prev=this.current;
			
			this.current.next=item;
			
			
			
		}
		
		this.current=item;
		this.size++;
		
		
		
	}
	
	public void insert(int[] array){
		
		for(int i=0; i<array.length; i++){
			
			insert(array[i]);
		}
		
	}
	
	
	public void remove(){
		
		if(this.isEmpty())
			return;
			
		
		if(this.size==1){
			
			this.head=this.tail=this.current=null;
			
		}else if(this.current==this.tail){
			
			this.movePrev();
			
			this.current.next=null;
			
			this.tail.next=null;
			this.tail.prev=null;
			
			this.tail=this.current;
			
			
		}else{
			
			if(this.current==this.head){
				
				this.head=this.head.next;
				
				
			}
			
			this.moveNext();
			
			this.current.prev.next=null;
			this.current.prev=null;
			
			
			
			
		}
		
		this.size--;
		
	}
	
	
	public void print(){
		
		if(!(this.isEmpty())){
			
			Node temp=this.head;
			while(temp.next!=null){
				
				System.out.print(temp.getData()+" ");
				temp=temp.next;
				
			}
			
			System.out.println();
			
		}else{
			
			System.out.println("No elements are present in the list");
			
		}
		
	}
	
	
	
	public class Node{
		
		Node next;
		Node prev;
		int key;
		
		
		public Node(int key){
			
			this.key=key;
			
			this.prev=this.next=null;
		}
		
		
		public int getData(){
			
			return this.key;
		}
		
		
		
}

	
	public static void main(String[] args) {

		
		

	}
	
	
	
	
	

}
