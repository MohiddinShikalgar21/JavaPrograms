package Test;
import java.util.*;
public class sellstocks {
    static int maxprofit(int[] arr) {
    	int min=arr[0];
    	int maxprofit=0;
    	for(int i=0;i<arr.length;i++) {
    		maxprofit= Math.max(maxprofit, arr[i]-min);
    		min= Math.min(min, arr[i]);
    	}
    	return maxprofit;
    }
    public static void main(String[] args) {
    	int[] arr= {12,7,4,5,3,2,12,18,7,6,5};
    	int profit= maxprofit(arr);
    	System.out.println(profit);
    }
}
