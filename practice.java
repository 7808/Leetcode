package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;

public class practice
{

	
		public static void main(String[] args)
		{
		int[] nums = {10, 22, 12, 3, 0, 6};
		ArrayList<Integer> ans = leaders(nums);
		System.out.println(ans);

		}

		static ArrayList<Integer> leaders(int[] nums)
		{
		  ArrayList<Integer> al =new ArrayList<>();

		for(int i =0;i<nums.length;i++)
		{

		   boolean leader  = true;

		for (int j =i+1;j<nums.length;j++)
		{
		   
		    if(nums[j] >nums[i])
		      {  
		    
		    leader = false;
		    break;
		      }
		} 

		if(leader)
		{
		al.add(nums[i]);
		}

		}
		
	
		
		return al;
		}
}