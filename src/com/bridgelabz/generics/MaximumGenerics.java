package com.bridgelabz.generics;

public class MaximumGenerics<T extends Comparable<T>> {
	T x, y, z;

	public MaximumGenerics(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return MaximumGenerics.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("MaximumGenerics: " + max);
	}

	public static void main(String[] args) {
		Integer xInt = 3, yInt = 4, zInt = 5;
		Float xF1 = 6.6f, yF1 = 8.8f, zF1 = 7.7f;
		String xStr = "Pear", yStr = "Apple", zStr = "Orange";

		new MaximumGenerics(xInt, yInt, zInt).maximum();
		new MaximumGenerics(xF1, yF1, zF1).maximum();
		new MaximumGenerics(xStr, yStr, zStr).maximum();
	} 

}
