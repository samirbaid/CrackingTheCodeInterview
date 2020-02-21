package com.arraysAndStrings;

public class Ex1_8_StringRotationCheck {

	public static Boolean isSubstring(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		} else if(s1 == s2) {
			return false;
		}
		
		char[] cStr1 = s1.toCharArray();
		char[] cStr2 = s2.toCharArray();
		int rotateIndex=0;
		
		for(int i=0;i<cStr2.length;i++) {
			if(cStr2[i] == cStr1[0]) {
				rotateIndex=i;
				break;
			}
		}
		int j=0,i=rotateIndex;
		while(j<cStr1.length) {
			
			if(cStr2[i] != cStr1[j]) {
				return false;
			} else {
				i++;
				j++;
				if(i == cStr1.length) {
					i=0;
				}
			}
		}
		return true;
 	}
	
	public static void main(String args[]) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isSubstring(s1, s2));
	}
}
