package Test;
import java.util.*;
public class euclidgcd {
	static int gcd(int a,int b)
	{
		if(a==0) return b;
		else if(a>=b) return gcd(a-b,b);
		else return gcd(a,b-a);
	}
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	int x= sc.nextInt();
    	int y= sc.nextInt();
    	System.out.println(gcd(x,y));
    }
}
