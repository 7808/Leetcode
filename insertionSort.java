package Leetcode;

import java.util.Arrays;

public class insertionSort {
	public static void main(String[] args)
	{
	 int[] nums= {1,2,3,4,5,-21,-0,0,1};
	 
	 insertion(nums);
	System.out.println(Arrays.toString(nums));
	}

	static void insertion(int[] nums)
	{ 

	for(int i =0;i<nums.length;i++) {

	int last = nums.length-i-1;
	int start = 0;
	int maxel= max(nums,start, last);
	swap( nums , maxel, last); 

	}

	}
	 static int max(int[] nums , int start , int end)
	{

	int max = start;
	for(int i = start;i<=end;i++)
	{
	if(nums[max]< nums[i]){
	max = i;
	}}

	return max;
	}

	static void swap(int[] nums, int start, int end)
	{
	int temp = nums[start];
	nums[start] = nums[end];
	nums[end] = temp;
	}




}
