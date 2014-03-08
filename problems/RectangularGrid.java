package problems;

public class RectangularGrid {

	static long count=0;
	
	
	public static void main(String args[]){
		
		
		RectangularGrid ex=new RectangularGrid();
		long total=ex.countRectangles(2, 5);
		System.out.println(total);
		
	}
	
	public long countRectangles(int height, int width){
		
		
		normalRectangles(height,width);
		return count;
		

	}

	private void normalRectangles(int height, int width) {
		
		//For height side
		
		for(int h=height; h>0; h--)
		{
			
			for(int w=width; w>0;w--){
				
				
				if(h==w)
					continue;
				
				System.out.println(h+"X"+w);
				
				int widthPermutations=width-w+1;
				int heightPermutations=height-h+1;
				
				count+=(widthPermutations*heightPermutations);
				
				
			}
			
			
		}
		
		
	}

}
