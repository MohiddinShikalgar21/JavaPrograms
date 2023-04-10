package Test;

public class buynsellstocks2 {
    static int findprofit(int[] arr) {
    	int sum=0;
    	int i=1,j=0;
    	while(i<arr.length) {
       	    while(i<arr.length && arr[i]<arr[i-1]) i++;
    	    int buy=arr[i-1];
       	    while(i<arr.length && arr[i]>arr[i-1]) i++;
    	    int sell=arr[i-1];
    	    sum+=(sell-buy);
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	int[] arr= {2,3,4,1,2,32,12,11};
    	int ans=findprofit(arr);
        System.out.println(ans);
    }
}
