package Leetcode;

public class celingofno {

public static void main(String[] args)
{
 char[] nums = {'c','f','j'};
char target = 'd';
   char r = test(nums, target);
   System.out.println(r);
}

static char test(char[] nums, char target)
{

int start = 0;
int end = nums.length-1;

while(start<= end)

{
	int mid = start+(end-start)/2;

if( target < nums[mid])
{
  end = mid-1;
}
  else
{
  start = mid+1;
}   
}

return nums[start% nums.length];
}
}