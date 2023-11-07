package Leetcode;

import java.util.Arrays;

public class sort {

	


public static void main(String[] args)
{
  int[] a= {4,1,3,2,9,1};

 insertion(a);
System.out.println(Arrays.toString(a));
}

static void insertion(int[]a)
{

   for(int i =0;i<a.length-1;i++)
 {
for(int j =i+1;j>0;j--)

{
   if(a[j-1]>a[j])
 {
 swap(a, j ,j-1);
}
 else
{
break;
}
}
}

}

static void swap(int[]a , int s, int e)
{

int temp = a[s];
a[s] = a[e];
a[e] = temp;
}
}

