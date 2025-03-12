package com.nit.amar;

public class ArrayPrograms25
{
      //MaxSum
	 public static void maximumSum(int[] a,int k)
	 {
		int sum =0;
		for(int i= 1;i<=k;i++)
		{
			sum+= a[a.length-1];
			a[a.length-1]+=1;
		}
		System.out.println(sum);
	 }
	 //Binary array
	 public static void distanceOfOne(int[]a,int k)
	 {
		 boolean b =false;
		 int c=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==1)
			 {
				 for(int j=i+1;j<a.length;j++)
				 {
					 c++;
					 if(a[j]==1)
					 {
						 i= j-1;
						 break;
					 }
				 }
				 if(c>=k)
				 {
					 b=true;
					 
				 }
				 else
				 {
					 b=false;
					 break;
				 }
			 }
		 }
		 System.out.println(b);
	 }
}
