package Test;

public class adddigits {
	static int sum=0;
   static int adddigit(int n) {
	   
	   if(n<10) return n;
	  
	   else {
		   int temp=0;
		   while(n>=10) {
			   temp+=n%10;
			   n=(int)n/10;
		   }
		   n+=temp;
		   return adddigit(n);
	    }
    }
   public static void main(String[] args) {
	 int n=786;
	 System.out.println(adddigit(n));
   }
}
