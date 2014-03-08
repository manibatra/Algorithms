package ass1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class K_Nearest{
	
	static Node baseNode;
	
	public static void findNearestKNeighbours(List<Node> nodes, List<Node> k_neighbours, int i){
		
		
		baseNode =  nodes.get(i);
		
		k_neighbours=nodes;
		
		Comparator<Node> c = new Comparator<Node>() {
			
			@Override
			public int compare(Node o1, Node o2) {
				double distance1 = calculteDistance(o1);
				double distance2 = calculteDistance(o2);
				
				if(distance1 > distance2)
					return 1;
				else if(distance1 < distance2)
					return -1;
				else
					return 0;
				
			}
		};
		
		Collections.sort(k_neighbours, c );
		
}



	private static double calculteDistance(Node o2) {

		double w= 0.7;
		double[] thetas_diff = new double[baseNode.asvList.size()-1];
		
		double thetas_sum = 0;
		
		for(int i = 0; i < thetas_diff.length; i++){
			
			thetas_diff[i] = baseNode.thetas[i]- o2.thetas[i];
			
			if(thetas_diff[i] > Math.PI)
				thetas_diff[i] -=(2*Math.PI);
			else if(thetas_diff[i] < Math.PI)
				thetas_diff[i] += (2*Math.PI);
			
			thetas_sum += Math.abs(thetas_diff[i]);
			
			
			
		}
		
		
		
		
		
		double distance2 = w*Math.abs(o2.asvList.get(0).distance(baseNode.asvList.get(0))) + (1-w)*thetas_sum;
		return distance2;
	}

}
