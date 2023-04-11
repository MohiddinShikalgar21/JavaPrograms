package Test;
import java.util.*;

public class wordbreak {
    static boolean wordbreak(String s,List<String> list) {
    	Set<String> set=new HashSet<String>();
    	for(String s1:list) {
    		set.add(s1);
    	}
    	boolean[] dp=new boolean[s.length()+1];
    	dp[0]=true;
    	for(int i=1;i<=s.length();i++) {
    		for(int j=0;j<i;j++) {
    			if(dp[j] && set.contains(s.substring(j,i))) {
    				dp[i]=true;
    				break;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(dp));
    	return dp[s.length()];
    }
    public static void main(String[] args) {
    	List<String> l=new ArrayList<String>();
    	l.add("mohiddin");
    	l.add("shikalgar");
    	String s="mohiddinshikalgar";
    	String s2="mohiddinshikalgar21";
    	System.out.println(wordbreak(s,l)+" "+wordbreak(s2,l));
    }
}
