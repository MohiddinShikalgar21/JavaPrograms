package Test;
import java.util.*;
public class t18 {
    public static int factorial(int n)
    {
    	if(n==1) return 1;
    	else return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
    	System.out.println("Enter a number to find factorial:");
    	Scanner sc= new Scanner(System.in);
    	int p= sc.nextInt();
    	System.out.println("The factorial of "+p+" is: ");
    	System.out.print(factorial(p));
    }
}
