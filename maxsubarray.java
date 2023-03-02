package Test;

public class maxsubarray {
    public static void main(String[] args) {
    	int[] arr= {2,-23,34,12,2,-3,4};
        System.out.println(maxsubarray(arr));
    }

static int maxsubarray(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		if(sum<0) sum=0;
	}
	return sum;
}
}
