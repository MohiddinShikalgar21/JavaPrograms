package Test;
import java.util.*;

public class validparenthesis {
	static boolean isValid(String str) {
        if(str.length()%2==1) return false;
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c=='{' || c=='[') s.push(c);
            else if(c=='}' && !s.isEmpty() && s.peek()=='{') s.pop();
            else if(c==')' && !s.isEmpty() && s.peek()=='(') s.pop();
            else if(c==']' && !s.isEmpty() && s.peek()=='[') s.pop();
            else return false;
        }
        return s.isEmpty();
    }
	public static void main(String[] args) {
		String s1="({})[]";
		String s2="{{]]";
		System.out.println(isValid(s1)+" "+isValid(s2));
	}
}
