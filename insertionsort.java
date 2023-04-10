package Test;

public class insertionsort {
    static int[] insertionsort(int[] arr) {
    	for(int i=1;i<arr.length;i++) {
    		int key=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j]>key) {
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=key;
    	}
    	return arr;
    }
    public static void main(String[] args) {
    	int[] arr= {12,2,32,1,54,34};
    	int[] ans=insertionsort(arr);
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(ans[i]+" ");
    	}
    }
}
