package Test;

public class urlify {
    static void spaceremover(String s) {
    	for(int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i)!=' ') System.out.print(s.charAt(i));
    		else {
    			if(s.charAt(i+1)!=' ') { 
    				System.out.print("%20"+s.charAt(i+1)); 
    				i++;
    			}
    			else i++;
    		}
    		if(s.charAt(s.length()-1)!=' ') System.out.print(s.charAt(s.length()-1));
    	}
    }
    public static void main(String[] args) {
    	String s= "Mr Smithandhis friends are badmen  ";
    	spaceremover(s);
    }
}
