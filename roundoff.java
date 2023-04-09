package Test;
import java.util.*;
public class roundoff

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		if((a>=1) && (a<=50))
		{
		    System.out.println("100");
		}
		else if((a>=51) && (a<=100))
		{
		    System.out.println("50");
		}
		else
		{
		    System.out.println("0");
		}
	}
}
