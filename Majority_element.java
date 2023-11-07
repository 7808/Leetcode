package Leetcode;
import java.util.HashMap;

public class Majority_element {

	public static void main(String[] args)
	{
		int[] nums = {2,1,0,1};
		
		System.out.println(freq(nums));
	}
		static int freq(int[] nums)
		{
			if(nums.length ==0)
				return -1;
			int r = -1;
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int num :nums)

			  {
				if(map.containsKey(num))
				{
					map.put(num,map.get(num)+1);
					
				}
				   else
					map.put(num,1);
			   
			if(map.get(num) >nums.length/3)
			{
				r = num;
				break;
			}
			
		}return r;
		}		

}
