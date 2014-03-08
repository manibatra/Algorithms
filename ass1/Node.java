package ass1;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.LinkedList;
import java.util.List;


//A node will represent a particular state of our robot and contain the list of the adjacenet nodes
public  class Node{

	List<Point2D.Double> asvList = new LinkedList<Point2D.Double>();

	double[] thetas;


	//List of neighbours of the node
	List<Node> adjacentNodes = new LinkedList<Node>();

	//Constructor for the initial state and the goal state
	Node(List<Point2D.Double> asvList){

		this.asvList=asvList;
		this.thetas= new double[asvList.size()-1];

		for(int i=0; i < thetas.length; i++){

			thetas[i]=fillTheta(asvList, i);

		}

	}

	//Constructor for generating random configurations
	public Node(double x, double y, int count) {

		boolean valid = false;

		while(!valid){

			this.asvList.clear();

			this.asvList.add(new Point2D.Double(x, y));

			thetas = new double[count-1];

			//Generating random angles, making sure that polygon generated is convex

			thetas[0]=Math.toRadians(Math.random()*360);

			if(count > 2){

				for(int i = 1; i < thetas.length; i++){

					while(thetas[i] > thetas[i-1]){

						thetas[i] = Math.toRadians(Math.random()*360);

					}
				}

			}

			//Generating the position of next ASV
			for(int i = 0; i < count; i++){

				double boomLength= (Math.random()*0.025) + 0.05;
				Point2D.Double asv = new Point2D.Double(x + boomLength*Math.cos(thetas[i]) , y + boomLength*Math.sin(thetas[i]));
				this.asvList.add(asv);
				x=asv.getX();
				y=asv.getY();

			}

			valid = check_valid(this.asvList);

		}


	}



	private boolean check_valid(List<Double> asvList2) {

		if(!PolygonUtilities.checkConvexity(asvList2)){

			return false;

		}

		if(!PolygonUtilities.checkSelfIntersection(asvList2)){

			return false;

		}

		if(PolygonUtilities.area(asvList2) < (Math.PI*Math.pow((0.007*(asvList2.size()-1)), 2))){

			return false;

		}

		for(int i = 0; i < asvList2.size(); i++){

			if(!Assignment1.workspace.contains(asvList2.get(i)))
				return false;

		}


		return true;
	}

	//Calculating the angle of the joints from the position of the ASVs
	private double fillTheta(List<Point2D.Double> asvList2, int i) {

		return Math.acos(Math.abs(asvList2.get(i+1).getX()-asvList2.get(i).getX())/Math.abs(asvList2.get(i+1).distance(asvList2.get(i))));


	}



}
