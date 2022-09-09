package Test;
import java.util.*;
public class josephus {
	static int jos(int n,int k)
	{
		if(n==1) return 0;
		else return (jos(n-1,k)+k)%n ;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println(jos(a,b));
	}

}
