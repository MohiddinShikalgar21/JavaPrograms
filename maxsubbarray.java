package Test;
import java.util.*;
public class maxsubbarray {
    static int maxsubarray(int[] arr) {
    	int maxsum=0;
    	for(int i=0;i<arr.length;i++) {
    		int sum=0;
    		for(int j=i;j<arr.length;j++) {
    			sum+=arr[j];
    			maxsum= Math.max(maxsum, sum);
    		}
    	}
    	return maxsum;
    }
    public static void main(String[] args) {
    	int[] arr= {-5,4,6,-3,4,-1};
    	int sum= maxsubarray(arr);
    	System.out.println(sum);
    }
}
