package com.arraysAndStrings;

public class Ex1_2 {

	/*
	 * reverse c string
	 * Reverse a C style string
	 */
	
	public String reverseString(String str) {
		if(str.length()==0) {
			return null;
		}
		
		char[] c_Str = str.toCharArray();
		char temp;
//		System.out.println(c_Str.length);
		for(int i=0, j=c_Str.length-1;i<j;i++,j--) {
			temp=c_Str[i];
			c_Str[i]=c_Str[j];
			c_Str[j]=temp;
		}
		
		for(char c:c_Str) {
			System.out.print(c);
		}
		
		return new String(c_Str);
	}
	
	public static void main(String[] args) {
		Ex1_2 obj = new Ex1_2();
		System.out.println(obj.reverseString("ABCD"));
	}

}
