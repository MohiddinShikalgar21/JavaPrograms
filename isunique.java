//brute force solution
package Test;

import java.util.Arrays;

public class isunique {
    static boolean isunique(String s) {
    	char[] s1= new char[s.length()];
    	for(int i=0;i<s.length();i++) {
    		s1[i]= s.charAt(i);
    	}
    	Arrays.sort(s1);
    	for(int j=0;j<s1.length-1;j++) {
    		if(s1[j]==s1[j+1]) return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
    	String s= "abcdeqwrtyuiopfgy";
    	System.out.println(isunique(s));
    }
}
