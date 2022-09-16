package Test;
import java.util.*;
public class anagrams {
	static boolean anagram(String s1,String s2) {
		char[] s11=new char[s1.length()];
		char[] s22=new char[s2.length()];
		if(s1.length()!=s2.length()) return false;
		else {
			for(int i=0;i<s1.length();i++) {
				s11[i]=s1.charAt(i);
				s22[i]=s2.charAt(i);
			}
			Arrays.sort(s11);
			Arrays.sort(s22);
			for(int j=0;j<s1.length();j++) {
				if(s11[j]!=s22[j]) return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		String s1= "stringanagram";
		String s2= "ramnagaringst";
		System.out.println(anagram(s1,s2));
	}
}
