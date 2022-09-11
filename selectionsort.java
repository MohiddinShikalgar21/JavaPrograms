package Test;

public class selectionsort {
    static int[] selectionsort(int[] arr) {
    	
    	for(int i=0;i<arr.length-1;i++) {
    		int min= i;
    		for(int j=i+1;j<arr.length;j++) {
    		if(arr[j]<arr[min]) {
    			min=j;
    		}
    	}
    		swap(min,i,arr);
    }
    	return arr;
    }
    static void swap(int a,int b,int[] arr) {
    	int temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
    public static void main(String[] args) {
    	int[] arr= {2,0,22,3,456,21,33,12};
    	int[] sorted= selectionsort(arr);
    	for(int i=0;i<sorted.length;i++) {
    		System.out.print(sorted[i]+" ");
    	}
    }
}
