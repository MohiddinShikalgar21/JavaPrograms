package Test;
import java.util.*;
public class sqrt 
{
	    public static double mySqrt(double n) {
	    	return Math.pow(n, 0.5);
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        double x=sc.nextDouble();
	        System.out.println(mySqrt(x));
	    }
}
