package Test;

public class longestpalsubsequence {
    static boolean ispalindrome(String s) {
    	int i=0,j=s.length()-1;
    	while(i<=j) {
    		if(s.charAt(i++)!=s.charAt(j--)) return false;
    	}
    	return true;
    }
    static String longpalindrome(String s) {
    	if(s==null || s.length()==0) return "";
    	else {
    		String longestpalindrome="";
    		for(int i=0;i<s.length();i++) {
    			for(int j=i+1;j<s.length();j++) {
    				if(j-i>longestpalindrome.length() && ispalindrome(s.substring(i,j))) {
    					longestpalindrome=s.substring(i,j);
    				}
    			}
    		}
    		return longestpalindrome;
    	}
    }
    public static void main(String[] args) {
    	String s= "popomalalamoxz";
        System.out.println(longpalindrome(s));
    }
}
