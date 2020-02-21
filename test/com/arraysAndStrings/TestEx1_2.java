package com.arraysAndStrings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestEx1_2 {
	
	@Test
	public void testReverseStringWith4Letters() {
		Ex1_2 ex = new Ex1_2();
		String str = "ABCD";
		assertEquals("DCBA",ex.reverseString(str));
	}
	
	@Test
	public void testReverseStringWith1Letter() {
		Ex1_2 ex = new Ex1_2();
		String str = "A";
		assertEquals("A",ex.reverseString(str));
	}
	
	@Test
	public void testReverseStringWithNoLetter() {
		Ex1_2 ex = new Ex1_2();
		String str="";
		assertNull(ex.reverseString(str));
	}

}
