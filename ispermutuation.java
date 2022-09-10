package Test;

public class ispermutuation {
    static boolean ispermutuation(String s1,String s2) {
    	if(s1.length()!=s2.length()) return false;
    	else {
    		int i=0, j=0;
    		int count=0;
    		//for(int j=0;j<s2.length() && i<s1.length();j++) 
    		while(i<s1.length() && j<s2.length())
    		{
    			if(s1.charAt(i)==s2.charAt(j)) {
    				count++;
    				i++;
    				j=0;
    			}
    			else j++;
    		}
    		if(count==s1.length()) return true;
    		return false;
    	}
    }
    public static void main(String[] args) {
    	String s1= "vitpunez";
    	String s2= "uneptivs";
    	System.out.println(ispermutuation(s1,s2));
    	String s3= "vitpune";
    	String s4= "uneptiv";
    	System.out.println(ispermutuation(s3,s4));
    }
}
