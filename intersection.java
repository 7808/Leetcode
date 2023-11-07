package Leetcode;

import java.util.HashSet;

public class intersection {
	public static void main(String[] args)
	{
	int[] nums1 = {4,9,5};
	int[] nums2 = {9,4,9,8,4};

	majority(nums1,nums2);
	}
	
	
	
	static void majority(int[] nums1, int[] nums2)
	{

	  HashSet<Integer> set = new HashSet<>();    
	      int count=0;
	for(int i =0;i< nums1.length;i++)
	{
	     set.add(nums1[i]);
	}

	for(int i =0;i<nums2.length;i++)
	{
	   if(set.contains(nums2[i]))
	    {
	          count++;
	          System.out.println(nums2[i]);
	          
	          set.remove(nums2[i]);
	    }
	}

	
	    }
	}

	

