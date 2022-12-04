package Test;
import java.util.*;

public class firstuniquechar {
     static int firstunique(String s) {
    	 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    	 for(int i=s.length()-1;i>=0;i--) {
    		 if(map.containsKey(s.charAt(i))) {
    			 map.put(s.charAt(i), map.get(s.charAt(i))+1);
    		 }
    		 else map.put(s.charAt(i), 1);
    	 }
    	 for(int i=0;i<s.length();i++) {
    		 int j=map.get(s.charAt(i));
    		 if(j==1) return i;
    	 }
    	 return -1;
    	 
    	 //another approach
        //    	 int min = Integer.MAX_VALUE;
       //        for(char c: map.keySet()) {
      //           if(map.get(c) > -1 && characters.get(c) < min) {
     //                min = map.get(c);
    //             }
   //            }
  //         
 //             return min == Integer.MAX_VALUE ? -1 : min;
    	 
     }
     public static void main(String[] args) {
    	 String s="ggoodwill";
    	 System.out.println(firstunique(s));
     }
}
