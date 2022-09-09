package Test;

public class factbyrec {
    static int factorial(int n) {
    	if(n<2) return 1;
    	else return n*factorial(n-1);
    }
    public static void main(String[] args) {
    	System.out.println(factorial(8));
    }
}
