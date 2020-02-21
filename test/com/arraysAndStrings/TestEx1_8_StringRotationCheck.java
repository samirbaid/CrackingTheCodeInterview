package com.arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEx1_8_StringRotationCheck {

	@Test
	public void test_RotatedStrings() {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		assertEquals(true,Ex1_8_StringRotationCheck.isSubstring(s1, s2));
		
	}
	
	@Test
	public void test_SameStringsShouldReturnFalse() {
		String s1 = "waterbottle";
		String s2 = "waterbottle";
		assertEquals(false,Ex1_8_StringRotationCheck.isSubstring(s1, s2));
		
	}
	
	@Test
	public void test_UnequalStringsShouldReturnFalse() {
		String s1 = "waterbottle";
		String s2 = "wateottle";
		assertEquals(false,Ex1_8_StringRotationCheck.isSubstring(s1, s2));
		
	}
	
	@Test
	public void test_NotrotatedStringsShouldReturnFalse() {
		String s1 = "waterbottle";
		String s2 = "watbottlere";
		assertEquals(false,Ex1_8_StringRotationCheck.isSubstring(s1, s2));
		
	}
	
	@Test
	public void test_OnlyOneRotationShouldReturnTrue() {
		String s1 = "waterbottle";
		String s2 = "ewaterbottl";
		assertEquals(true,Ex1_8_StringRotationCheck.isSubstring(s1, s2));
		
	}
	
	

}
