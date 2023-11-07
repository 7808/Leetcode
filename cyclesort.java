package Leetcode;

import java.util.Arrays;

public class cyclesort {

	


public static void main(String[] args)
{
  int[] a= {4,5,6,7,8,1,3,2};

 cycle(a);
System.out.println(Arrays.toString(a));
}

static void cycle(int[]a)
{
   int i =0;

while(i <a.length)
{
   int current = a[i] - 1;
if(a[i] != a[current])

{
  swap(a,i,current);

 }

else
{
    i++;
}

}}

static void swap(int[]a , int s, int e)
{

int temp = a[s];
a[s] = a[e];
a[e] = temp;
}
}


