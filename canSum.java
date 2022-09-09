
package Test;

public class canSum {
    static boolean canSum(int sum,int[] arr) {
    	if(sum==0) return true;
    	else if(sum<0) return false;
    	else {
    		for(int i=0;i<arr.length;i++) {
    			int remainder=sum-arr[i];
    			boolean t1= canSum(remainder,arr);
    			if(t1==true) return true;
    		}
    	return false;
    	}
    }
    public static void main(String[] args) {
    	int n=7;
    	int[] arr= {2,4,2,6,9,7};
    	System.out.println(canSum(n,arr));
    }
}
