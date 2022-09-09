package Test;
import java.util.*;
public class t4 {
	public static void main(String[] args)
	{
		String rev="";
		System.out.println("Enter a string to find whether Palindrome or Not:");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char j= s.charAt(i);
			rev=j+rev;
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
