package com.bridgelabz.generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxTest<result> {
	// for integer
	Comparable result1 = new MaximumGenerics(3,4,5).maximum();
	@Test
	public void largestNumberatfirstposition() {
		assertEquals(5, result1);
	}
	@Test
	public void largestNumberatsecondposition() {
		assertEquals(5, result1);
	}
	@Test
	public void largestNumberatthirdposition() {
		assertEquals(5, result1);
	}
	
	// for float 
	Comparable result2 = new MaximumGenerics (6.6f,8.8f,7.7f).maximum();
	@Test
	public void largestFloatatfirstposition() {
		assertEquals(8.8f, result2);
	}
	@Test
	public void largestFloatatsecondposition() {
		assertEquals(8.8f, result2);
	}
	@Test
	public void largestFloatatthirdposition() {
		assertEquals(8.8f, result2);
	}
	
	// for string
	Comparable result3 = new MaximumGenerics("Pear","Apple","Orange").maximum();
	@Test
	public void largestStringatfirstposition() {
		assertEquals("Pear", result3);
	}
	@Test
	public void largestStringatsecondposition() {
		assertEquals("Pear", result3);
	}
	@Test
	public void largestStringatthirdposition() {
		assertEquals("Pear", result3);
	}
}


