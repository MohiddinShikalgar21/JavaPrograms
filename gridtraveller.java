package Test;
import java.util.*;
public class gridtraveller {
    static int gridtravel(int m,int n) {
    	if(m==1 || n==1) return 1;
    	else return (gridtravel(m-1,n)+gridtravel(m,n-1));
    }
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	int m=sc.nextInt();
    	int n=sc.nextInt();
    	System.out.println(gridtravel(m,n));
    }
}
