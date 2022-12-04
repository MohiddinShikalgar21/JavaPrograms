package Test;

public class reverseworrdsinstring {
    static String reverse(String s) {     
    	String[] arr=s.trim().split(" ");
    	String ans="";
    	for(int i=arr.length-1;i>=0;i--) {
    		ans=ans+arr[i];
    		ans+=" ";
    	}
    	return ans;
    }
    public static void main(String[] args) {
    	String s="My name is Mohiddin";
    	String ans=reverse(s);
    	System.out.println(ans);
    }
}
