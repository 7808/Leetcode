package Leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class union {

public static void main(String[] args)
{
	
	int[] a = {1,2,3,4};
	int[] b = {4,5,6,1};
       uni(a,b);
	
}

 static void uni(int[]a , int[]b)
{
	HashSet<Integer> set = new HashSet<>();
	
 for(int i =0;i<a.length;i++)
 {
	 set.add(a[i]);
 }
 
 for(int i =0;i<b.length;i++)
 {
	 set.add(b[i]);
 }
 Iterator it = set.iterator();
 
	 while(it.hasNext())
	 {
		  System.out.println(it.next());
       }
 
             }

}
