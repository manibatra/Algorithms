package artificailIntelligence;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{

	public String data;
	public boolean visited = false;
	public Node parent;
	public List<Node> adjacentNodes = new LinkedList<Node>();
	public Node(String data){

		this.data = data;


	}

	public void addAdjacentNode(final Node node){

		adjacentNodes.add(node);
		node.adjacentNodes.add(this);

	}


}	

public class BFS {

	/**
	 * @param args
	 */

	private static Queue<Node> q;
	public static String goal;

	public static void startJourney(Node rootNode){

		q = new LinkedList<Node>();	
		q.add(rootNode);
		rootNode.visited= true;

		outer:		while(!q.isEmpty()){

			Node n = (Node)q.poll();




			for(Node adj : n.adjacentNodes){



				if(!adj.visited){

					adj.visited= true;
					q.add(adj);
					adj.parent=n;
					if(adj.data == goal){

						solution(adj);
						break outer;

					}
				}
			}


		}


	}

	private static void solution(Node adj) {

		System.out.print(adj.data + " <-- ");

		if(adj.parent != null){

			solution(adj.parent);


		}


	}

	public static void main(String args[]){

		Node eightytwoD = new Node("82D");
		Node taxiRank = new Node("Taxi Rank");
		Node greatCourt = new Node("Great Court");
		Node theatre = new Node("Theatre");
		Node union = new Node("Union");
		Node fifty = new Node("50");
		Node seventyEight = new Node("78");
		
		eightytwoD.addAdjacentNode(taxiRank);
		eightytwoD.addAdjacentNode(greatCourt);
		
		taxiRank.addAdjacentNode(fifty);
		
		greatCourt.addAdjacentNode(theatre);
		greatCourt.addAdjacentNode(union);
		
		theatre.addAdjacentNode(union);
		
		union.addAdjacentNode(seventyEight);
		
		fifty.addAdjacentNode(seventyEight);
		
		goal = "Union";
		
		startJourney(taxiRank);
		
		

	}


}
