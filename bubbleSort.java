package Leetcode;

import java.util.Arrays;



public class bubbleSort{
public static void main(String[] args)
{
 int[] nums = {2,0,2,1,1,0};
  test(nums);
  System.out.println(Arrays.toString(nums));
}

static void test(int[] nums)
{
 boolean swapped;
  for(int i=0;i<nums.length;i++)
{
  swapped = false;
  for(int j = 1;j<nums.length-i;j++)

 { 
      if(nums[j]<nums[j-1])
      {
 int temp =  nums[j];
nums[j] = nums[j-1];
nums[j-1] = temp;
swapped = true;

}}
if(!swapped)
{
break;}
}


}
}