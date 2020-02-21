package com.arraysAndStrings;

/* Remove duplicate characters without additional buffers */
public class Ex1_3_RemoveDuplicatesFromString {
	
	/* Assumptions :-
	 * This is an alpha-neumeric String. No special characters
	 */
	
	/* Logic
	 * Run a nested loop and if duplicate is found then mark with #
	 * Run another loop. Here --
	 * 		Keep incrementing i till we hit first '#'.
	 * 		Keep i constant and keep iterating j.
	 * 		if j does not match '#' then copy content from j to i and increment both. Set j to #
	 *  	if j matches '#' then increment j
	 *  Run another loop to find the starting of '#' as all '#' should be at the end.
	 *  Extract substring and return.
	 *  
	 *  Complexity -- O(n^2) + O(n) + O(n) ==> O(n^2)
	 */
	public static String removeDuplicates(String str) {
		if(str.length() == 0) {
			return null;
		}
		
		char[] c_str = str.toCharArray();
		
		for(int i=0;i<c_str.length;i++) {
			if(c_str[i] == '#')
				continue;
			
			for(int j=i+1;j<c_str.length;j++) {
				if(c_str[i] == c_str[j]) {
					c_str[j]='#';
				}
			}
		}
	
		Boolean i_iterated = false;
		for(int i=0,j=0;j<c_str.length;j++) {
			
			if(!i_iterated && c_str[i]!='#') {
				i++;
				continue;
			} 
			
			if(!i_iterated && c_str[i]=='#') {
				i_iterated = true;				
				continue;
			}
			
			if(c_str[j]=='#')
				continue;
			else {
				c_str[i++]=c_str[j];
				c_str[j]='#';
			}
		}
		
		int endIndexForStr=c_str.length;
		for(int i=0;i<c_str.length;i++) {
			if(c_str[i]=='#') {
				endIndexForStr=i;
				break;
			}
		}
		
		return new String(new String(c_str).substring(0, endIndexForStr));
	}
	
}
