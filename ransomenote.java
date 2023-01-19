
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

package Test;
import java.util.*;

public class ransomenote {
    public static void main(String[] args) {
    	String ransomNote = "aa";
    	String magazine = "baa";
    	System.out.println(canConstruct(ransomNote,magazine));
    }
	static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
            int n=map.getOrDefault(magazine.charAt(i),0);
            map.put(magazine.charAt(i),n+1);
        }
        for(int j=0;j<ransomNote.length();j++){
            if(!map.containsKey(ransomNote.charAt(j))) return false;
            else if(map.get(ransomNote.charAt(j))<1) return false;
            map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
        }
        return true;
    }
}
