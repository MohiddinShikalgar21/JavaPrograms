package Test;

public class finalsum {
    static int sum(int n) {
    	int sum=0;
    	if(n<10) return n;
    	while(n>0) {
    		int m=n%10;
    		sum+=m;
    		n=n/10;
    	}
	    return sum(sum);
    }
    public static void main(String[] args) {
    	int n=1895;
    	System.out.println(sum(n));
    }
}
