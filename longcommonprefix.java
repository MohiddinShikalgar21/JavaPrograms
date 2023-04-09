package Test;
import java.util.*;

public class longcommonprefix {
	  static String longestCommonPrefix(String[] strs) {
	        int size=strs.length;
	        if(size==0) return "";
	        else if(size==1) return strs[0];
	        else{
	            Arrays.sort(strs);
	            for(String s:strs) {
	            	System.out.print(s+" ");
	            }
	            int end=Math.min(strs[0].length(),strs[size-1].length());
	            int i=0;
	            while(i<end && strs[0].charAt(i)==strs[size-1].charAt(i)) i++;

	            String ans=strs[0].substring(0,i);
	            return ans;
	        }
	  }
	  public static void main(String[] args) {
		  String[] s1={"flower","fl","flwer"};
		  System.out.println(longestCommonPrefix(s1));
	  }
}

