package Test;

public class bubblesort {
    static int[] bubblesort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=1;j<arr.length-i;j++) {
    			if(arr[j-1]>arr[j]) swap(j-1,j,arr);
    		}
    	}
    	return arr;
    }
    static void swap(int a,int b,int[] arr) {
    	int temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
    public static void main(String[] args) {
    	int[] arr= {22,12,0,23,11,6,4,45};
    	int[] ans= bubblesort(arr);
    	for(int i=0;i<ans.length;i++) {
    		System.out.print(ans[i]+" ");
    	}
    }
}
