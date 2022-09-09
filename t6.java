package Test;
import java.util.*;
public class t6 {
    public static void main(String[] args)
    {
    	System.out.println("Enter the first string:");
    	Scanner sc = new Scanner(System.in);
    	String first=sc.nextLine();
    	System.out.println("Enter the second string:");
    	Scanner sc2= new Scanner(System.in);
    	String second= sc2.nextLine();
    	String common="";
    	for(int i=0;i<first.length();i++)
    	{
    		for(int j=0;j<second.length();j++)
    		{
    			if(first.charAt(i)==second.charAt(j))
    			{
    				common=common+first.charAt(i);
    			}
    		}
    	}
    	System.out.println(common);
    }
}
