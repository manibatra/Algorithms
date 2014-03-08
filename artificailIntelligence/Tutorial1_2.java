package artificailIntelligence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Tutorial1_2 {

	/**
	 * @param args
	 */
	static final byte[] goalTiles = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	final PriorityQueue <State> queue  = new PriorityQueue<State>(100, new Comparator<State>() {
		
		public int compare(State a, State b){
			
			return a.priority() - b.priority();
			
		}
		
	});
	
	final HashSet <State> closed  = new HashSet<State>();
	
	class State{
		
		final byte[] tiles;
		final int g;
		final int h;
		final int spaceIndex;
		final State prev;
		
		 State(byte [] initial) {
	            tiles = initial;
	            spaceIndex = index(tiles, 0);
	            g = 0;
	            h = heuristic(tiles);
	            prev = null;
	        }
		
		
		


		State(State prev, int slideFromIndex){
			
			tiles = Arrays.copyOf(prev.tiles, prev.tiles.length);
			tiles[prev.spaceIndex] = tiles[slideFromIndex];
			tiles[slideFromIndex] = 0;
			this.spaceIndex = slideFromIndex;
			this.prev=prev;
			this.g = prev.g + 1;
			this.h = heuristic(tiles);
			
		}
		
		int priority(){
			
			return g + h;
			
		}
		
		boolean isGoal(){
			
			return Arrays.equals(tiles, goalTiles);
			
		}
		
		public boolean equals(Object obj){
			
			if(obj instanceof State){
				
				State other = (State)obj;
				return Arrays.equals(tiles, other.tiles);
				
			}
			return false;
			
		}
		
		void print(){
			
			System.out.println("p = " + priority() + " = g + h = " + g + " + " + h);
			for(int i = 0; i < tiles.length; i += 3){
				
				System.out.println(tiles[i] + " " + tiles[i+1] + " " + tiles[i+2]);
				
			}
			
		}
		
		void printAll(){
			
			while(prev!=null)
				prev.printAll();
			print();
				
		}
		
		State movesS(){ return spaceIndex > 2 ? new State(this, spaceIndex - 3): null; }
		State movesN(){ return spaceIndex < 6 ? new State(this, spaceIndex + 3): null; }
		State movesW(){ return spaceIndex % 3 < 2 ? new State(this, spaceIndex + 1): null; }
		State movesE(){ return spaceIndex % 3 > 0 ? new State(this, spaceIndex - 1): null; }




		
		
	}
	
	void addSucccessor(State successor){
		
		if(successor!= null && !closed.contains(successor)){
			
			queue.add(successor);
			
		}
		
	}
	
	void solve(byte[] initial){
		
		queue.clear();
		closed.clear();
		
		queue.add (new State(initial));
		
		
		
		while(!queue.isEmpty()){
			
			State current = queue.poll();
			
			
			if(current.isGoal()){
				
				current.printAll();
				return;
				
			}
			
			closed.add(current);

			addSucccessor(current.movesN());
			addSucccessor(current.movesS());
			addSucccessor(current.movesE());
			addSucccessor(current.movesW());

		}
		
		
	}
	
	private int index(byte[] tiles, int i) {

		for(int j = 0; j < tiles.length; j++){
			
			if(tiles[j] == i)
				return j;
				
		}

		return -1;
	}
	
	private int heuristic(byte[] tiles2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
