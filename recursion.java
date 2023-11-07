package Leetcode;

public class recursion {
public static void main(String args[])
{
 int[] a  = {1,2,4,5,6,90,99};

int t  = 99;

int l =0;
int r = a.length-1;
int res  = BSR(a,l,r,t);

System.out.println(res);

}

static int BSR(int[] a , int l , int r , int t)
{
   if(r>=l)
{

 int mid = l+(r-l)/2;
if(a[mid] == t)

return mid;

if (a[mid] >t)

return  BSR(a, l, mid-1,t);
return BSR(a, mid+1,r,t);
} 

return -1;
}
}


