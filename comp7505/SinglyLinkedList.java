package comp7505;

class Node{
	
	private String element;
	private Node next;
	
	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
	public Node(String s, Node n){
		
		this.element=s;
		this.next=n;
		
		
	}
	
	
	
	
}

public class SinglyLinkedList {
	
	protected Node head;
	
	protected long size;
	
	public SinglyLinkedList(){
		
		head=null;
		size=0;
		
	}

}

class CircularList{
	
	protected Node cursor;
	

	protected long size;
	
	public CircularList(){
		
		cursor=null;
		size=0;
		
	}
	
	public Node getCursor() {
		return cursor;
	}

	public long getSize() {
		return size;
	}
	
	public void advance(){
		
		cursor=cursor.getNext();
		
	}
	
	public void add(Node newNode){
		
		if(cursor==null){
			
			cursor=newNode;
			
			
		}else{
			
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
			
			
			
		}
		
		size++;
		
	}
	
	
	public Node remove(){
		
		Node oldNode=cursor.getNext();
		if(oldNode.getNext()==cursor){
			
			cursor=null;
			
		}else{
			
			cursor.setNext(oldNode.getNext());
			oldNode.setNext(null);
			
		}
		
		size--;
		
		return oldNode;
		
	}
	
	public String toString(){
		
		Node oldNode=cursor;
		
		String s=""+oldNode.getElement();
		
		for(advance(); oldNode!=cursor;advance()){
			
			s+="  "+cursor.getElement();
			
		}
		
		return s;
		
		
	}
	
	
	
}


