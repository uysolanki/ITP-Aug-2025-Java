package day29;

public class WaterTank {

	public static void main(String[] args) {
		int heights[]= {1,8,6,2,5,4,8,3,7};
		
		int maxWater=calculateMaxWater(heights);
		
		System.out.println(maxWater);

	}

	private static int calculateMaxWater(int[] heights) {
		int left=0;
		int right=heights.length-1;
		int maxWater=0;
		
		while(left<=right)
		{
			int height=Math.min(heights[left], heights[right]);
			int width=right-left;
			int water=width*height;
			
			maxWater=Math.max(maxWater, water);
			
			if(left<right)
				left++;
			else
				right--;
		}
		
		return maxWater;
	}

}
