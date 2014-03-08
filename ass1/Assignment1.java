package ass1;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import ass1.Assignment1.Obstacle;

public class Assignment1 {

	/**
	 * @param args
	 */
	
	//Creating the workspace with limits [0,1]x[0,1]
	static final Rectangle2D.Double workspace = new Rectangle2D.Double(1,1,1,1);
	
	//The set of obstacles 
	final static HashSet<Obstacle> obstacles = new HashSet<Obstacle>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	//Creating an obstacle object from the given points
	class Obstacle{
		
		Rectangle2D.Double obstacle;
		
		Obstacle(Point2D.Double uL, Point2D.Double lL, Point2D.Double lR, Point2D.Double uR){
			
			this.obstacle = new Rectangle2D.Double(uL.getX(), uL.getY(), uL.distance(uR), uL.distance(lL));
			
		}
		
	}
	
	//Add the obstacles to the set of obstacles 
	void addObstacle(Obstacle o){
		
		this.obstacles.add(o);
		
	}
	
	List<Node> nodes = new LinkedList<Node>();
	
	void sample(int n, int count){
		
		int i = 0;
		while(i <= n){
			
		  double x = Math.random();
		  double y = Math.random();
		  
		  Node newNode = new Node(x, y, count);
		  
		  gaussian_sample(newNode);
			
			
		}
		
		
	}

	//Generate a gaussian sample for a node 
	private void gaussian_sample(Node newNode) {
	 
		double meanX = newNode.asvList.get(0).getX();
		double meanY = newNode.asvList.get(0).getY();
		
		double stdDev = PolygonUtilities.stdDev(newNode.asvList);
		
		Random r = new Random();
		
		double newSampleX = r.nextGaussian()*stdDev+meanX;
		double newSampleY = r.nextGaussian()*stdDev+meanY;
		
		Node newNode2 = new Node(newSampleX, newSampleY, newNode.asvList.size());
		
		
		if(check_obstacle(newNode) && !check_obstacle(newNode2)){
			
			nodes.add(newNode);
			newNode2 = null;
			
		}else if (check_obstacle(newNode2) && !check_obstacle(newNode)){
			
			nodes.add(newNode2);
			newNode = null;
			
		}else{
			
			newNode = null;
			newNode2 = null;
			
		}
		
		
		
	}

	//Checking if the nodes are valid ie they pass all the four tests : self collision, convexity, minimum area, obstacles
	
	private boolean check_obstacle(Node newNode) {
		
		Iterator<Obstacle> iterator = obstacles.iterator();
		
		for(int i = 0; i < newNode.asvList.size()-1; i++){
			
			Line2D.Double l1 = new Line2D.Double(newNode.asvList.get(i), newNode.asvList.get(i+1));
			
			while(iterator.hasNext()){
				
				if(l1.intersects(((Obstacle)iterator.next()).obstacle))
					return false;
				
			}
			
			
		}
		
		return false;
	}
	

}
