package Test;
import java.util.*;
public class fibonacci {
    static int fib(int n)
    {
    	if(n<2) return 1;
    	else return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] main)
    {
    	Scanner sc= new Scanner(System.in);
    	int t= sc.nextInt();
    	int m= fib(t);
    	System.out.println(m);
    }
}
