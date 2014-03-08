package ass1;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.List;

public class PolygonUtilities {

	/**
	 * Function to calculate the area of a polygon, according to the algorithm
	 * defined at http://local.wasp.uwa.edu.au/~pbourke/geometry/polyarea/
	 * 
	 * @param polyPoints
	 *            array of points in the polygon
	 * @return area of the polygon defined by pgPoints
	 */
	public static double area(List<Point2D.Double> asvList) {


		int i, j, n = asvList.size();
		double area = 0;

		for (i = 0; i < n; i++) {
			j = (i + 1) % n;
			area += asvList.get(i).getX() * asvList.get(j).getY();
			area -= asvList.get(j).getX() * asvList.get(i).getY();
		}
		area /= 2.0;
		return (area);
	}

	/**
	 * Function to calculate the center of mass for a given polygon, according
	 * ot the algorithm defined at
	 * http://local.wasp.uwa.edu.au/~pbourke/geometry/polyarea/
	 * 
	 * @param polyPoints
	 *            array of points in the polygon
	 * @return point that is the center of mass
	 */
	public static Point2D.Double centerOfMass(List<Point2D.Double> asvList) {
		double cx = 0, cy = 0;
		double area = area(asvList);
		// could change this to Point2D.Float if you want to use less memory
		Point2D.Double res = new Point2D.Double();
		int i, j, n = asvList.size();

		double factor = 0;
		for (i = 0; i < n; i++) {
			j = (i + 1) % n;
			factor = (asvList.get(i).getX() * asvList.get(j).getY()
					- asvList.get(j).getX() * asvList.get(i).getY());
			cx += (asvList.get(i).getX() + asvList.get(j).getX()) * factor;
			cy += (asvList.get(i).getY() + asvList.get(j).getY()) * factor;
		}
		area *= 6.0f;
		factor = 1 / area;
		cx *= factor;
		cy *= factor;
		res.setLocation(cx, cy);
		return res;
	}

	//Used for calculating the standard deviation to be used in the gaussian distribution 
	public static double stdDev(List<Point2D.Double> asvList){

		Point2D.Double refrencePoint = centerOfMass(asvList);

		double maxDistance = 0;

		for(int i = 0; i < asvList.size(); i++){

			maxDistance = Math.max(maxDistance, Math.abs(refrencePoint.distance(asvList.get(i))));

		}

		return 2*maxDistance;


	}

	//Checking the convexity of the polygon formed by the asvs
	public static boolean checkConvexity(List<Point2D.Double> asvList)
	{
		if (asvList.size() < 3) return false;

		Point2D.Double p;
		Point2D.Double v;
		Point2D.Double u;
		int res = 0;
		for (int i = 0; i < asvList.size(); i++)
		{
			p = asvList.get(i);
			Point2D.Double tmp = asvList.get((i+1) % asvList.size());
			v = new Point2D.Double();
			v.x = tmp.x - p.x;
			v.y = tmp.y - p.y;
			u = asvList.get((i+2) % asvList.size());

			if (i == 0) // in first loop direction is unknown, so save it in res
				res = (int) (u.x * v.y - u.y * v.x + v.x * p.y - v.y * p.x);
			else
			{
				int newres = (int) (u.x * v.y - u.y * v.x + v.x * p.y - v.y * p.x);
				if ( (newres > 0 && res < 0) || (newres < 0 && res > 0) )
					return false;
			}
		}
		return true;
	}

	//Checking the polygon for self intersection
	public static boolean checkSelfIntersection(List<Point2D.Double> asvList){

		//checking if any two asv overlap
		for(int i = 0; i < asvList.size()-1; i++){

			for(int j = i+1; j < asvList.size(); j++){


				if(asvList.get(i).equals(asvList.get(j))){

					return false;

				}



			}

		}

		//checking if the polygon formed by the asv self intersects
		for(int i = 0; i < asvList.size()-2; i++){

			for(int j = i+1; j < asvList.size()-1; j++){

				Line2D.Double l1 = new Line2D.Double(asvList.get(i), asvList.get(j));
				Line2D.Double l2 = new Line2D.Double(asvList.get(j), asvList.get(j+1));

				if(l1.intersectsLine(l2))
					return false;

			}



		}

		return true;

	}	

}