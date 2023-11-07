package Leetcode;

public class moore{

public static void main(String[] args)
{
   int[] nums = {2,2,1,1,1,2,2};

System.out.println(majority(nums));
}

static int majority(int[] nums)
{

 int count =0;
int can =0;

for(int num:nums)
{
   if(count==0)
 can = num;

if(can == num)
  count+=1;
else count-=1;

}
return can;

}
}
   