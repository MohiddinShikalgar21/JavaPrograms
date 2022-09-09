package Test;

public class kadanealgo {
    static int maxsubarray(int[] arr) {
    	int maxsum=Integer.MIN_VALUE;
    	int cursum=0;
    	for(int i=0;i<arr.length;i++) {
    		cursum+=arr[i];
    		maxsum=Math.max(maxsum, cursum);
    		if(cursum<0) cursum=0;
    	}
    	return maxsum;
    }
    public static void main(String[] args) {
    	int[] arr= {-5,-4,-6,-3,-4,-1};
    	int maxsum= maxsubarray(arr);
    	System.out.println(maxsum);
    }
}
