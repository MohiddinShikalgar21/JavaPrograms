package Test;

public class buynsellstock {
    static int maxprofit(int[] arr) {
    	if(arr.length==0) return 0;
    	int min=arr[0];
    	int max=0;
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]>min) {
    			max=Math.max(max, arr[i]-min);
    		}
    		else min=arr[i];
    	}
    	return max;
    }
    public static void main(String[] args) {
    	int[] prices= {12,13,11,10,15,16,17,9,10};
    	int profit=maxprofit(prices);
    	System.out.println(profit);
    }
}
