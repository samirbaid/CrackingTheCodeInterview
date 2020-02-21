package com.arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEx1_3_RemoveDuplicatesFromString {

	@Test
	public void testRemovingDuplicates() {
		String str = "AABBBBBDD";
		assertEquals("ABD",Ex1_3_RemoveDuplicatesFromString.removeDuplicates(str));
	}
	
	@Test
	public void testStringWithNoDuplicates() {
		String str = "ABCD";
		assertEquals("ABCD",Ex1_3_RemoveDuplicatesFromString.removeDuplicates(str));
	}
	
	@Test
	public void testStringWithNullStrings() {
		String str = "";
		assertNull(Ex1_3_RemoveDuplicatesFromString.removeDuplicates(str));
		
	}
	
	@Test
	public void testStringWithSomeDuplicates() {
		String str = "CanThisReallyHappen";
		assertEquals("CanThisRelyHp",Ex1_3_RemoveDuplicatesFromString.removeDuplicates(str));
		
	}
	
	@Test
	public void testStringWithNonContiguosDuplicates() {
		String str = "ababaabbababcabc";
		assertEquals("abc",Ex1_3_RemoveDuplicatesFromString.removeDuplicates(str));
		
	}


}
