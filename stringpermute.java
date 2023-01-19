package Test;
import java.util.*;
public class stringpermute {
    static boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
        for(int j=0;j<s1.length();j++){
            int n=map.getOrDefault(s1.charAt(j),0);
            map.put(s1.charAt(j),n+1);
            map2.put(s1.charAt(j),n+1);
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            if(check(s2.substring(i,i+s1.length()),map)){
                return true;
            }
            map=map2;
            for(char m:map2.keySet()) {
            	System.out.print(m+" : "+map2.get(m)+" ");
            }
        }
        return false;
    }
    static boolean check(String s,HashMap<Character,Integer> map){
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) {
            	System.out.println(s+"1");
            	return false;
            }
            
            //System.out.println();
            if(map.get(s.charAt(i))<=0) {
            	System.out.println(s+" "+s.charAt(i)+"2");
            	return false;
            }
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
        }
        return true;
    }
    public static void main(String[] args) {
    	String s= "abc";
    	String s2="bbbca";
    	
    	System.out.println(checkInclusion(s,s2));
    }
}