package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionNew {

	//Given two integer arrays nums1 and nums2, return an array of their intersection. 
	//Each element in the result must be unique and you may return the result in any order.

public static void main(String[] args)
{
  int[] nums1  = {1,2,2,1};
  int[] nums2 = {2,2};
  
 System.out.println(Arrays.toString(inter(nums1,nums2)));
  }

static int[] inter(int[] nums1, int[] nums2)
{
  if(nums1== null || nums2 == null)
{
return new int[0];}
HashSet<Integer> set = new HashSet<>();

ArrayList<Integer> al = new ArrayList<>();

for(int i =0;i<nums1.length;i++)
{
  set.add(nums1[i]);

}

for(int i =0;i<nums2.length;i++)
{
 if(set.contains(nums2[i]))
{
   al.add(nums2[i]);
    set.remove(nums2[i]);}}
int[] a = new int[al.size()];
for(int i =0;i<al.size();i++)
 {
     a[i] = al.get(i);


}
return a;
}
}