package com.bridgelabz.generics;

import java.util.Scanner;
public class Maximum {

	public int largestInteger(Integer x, Integer y, Integer z) {
		if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
		{
			return x;
		}
		else if(y > z)
		{
			return y;
		}
		else
		{
			return z;
		}

	}
	public float largestFloat(Float t, Float u, Float v) {
		if(t.compareTo(u) > 0 && t.compareTo(v) > 0)
		{
			return t;
		}
		else if(u > v)
		{
			return u;
		}
		else
		{
			return v;
		}

	}
	public String largestString(String a, String b, String c) {
		Integer str1 = a.length(); 
		Integer str2 = b.length(); 
		Integer str3 = c.length(); 
		if(str1.compareTo(str2) > 0 && str2.compareTo(str3) > 0)
		{
			return a;
		}
		else if(str2 > str3)
		{
			return b;
		}
		else
		{
			return c;
		}

	}
	public static void main(String[] args) {
		Integer x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer:");
		x = sc.nextInt();
		System.out.print("Enter the second integer:");
		y = sc.nextInt();
		System.out.print("Enter the third integer:");
		z = sc.nextInt();
		Maximum obj = new Maximum();
		int max = obj.largestInteger(x,y,z);
		
		float t,u,v;
		
		System.out.print("Enter the first float:");
		t = sc.nextFloat();
		System.out.print("Enter the second float:");
		u = sc.nextFloat();
		System.out.print("Enter the third float:");
		v = sc.nextFloat();
		
		float max1 = obj.largestFloat(t,u,v);
		
		String s1,s2,s3;
		System.out.print("Enter the first string:");
		s1 = sc.next();
		System.out.print("Enter the second string:");
		s2 = sc.next();
		System.out.print("Enter the third string:");
		s3 = sc.next();
		
		String max2 = obj.largestString(s1,s2,s3);
	}
}
