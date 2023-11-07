package Leetcode;

public class missing_number {
  
	public static void main(String[] args)
	{
		int[] nums = {1,2,0,4,3,6,5};
		
		int i = 0;
		
		int res = -1;
		while(i<nums.length)
		{
			int current = nums[i];
		
		if(nums[i] <nums.length && nums[i] != nums[current])
		{
			swap(nums, i , current);
			
		}
		else
		{
			i++;
		}
		}
		for(int index =0;index<nums.length;index++)
		{
			if(index != nums[index])
			{
				res = index;
				break;
			}
			
			else
				res = nums.length;
			
		}
		
		
		
		
		System.out.println(res);
		}
		
	
	

static void swap(int[] nums, int i ,int j)
{
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}


}
