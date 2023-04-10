package Test;

public class quicksort {
    static int partition(int[] arr,int low,int high) {
    	int pivot=arr[high];
    	int i=low-1;
    	for(int j=low;j<=high;j++) {
    		if(arr[j]<pivot) {
    			i++;
    			swap(arr,i,j);
    		}
    	}
    	swap(arr,i+1,high);
    	return i+1;
    }
    static void swap(int[] arr,int i,int j) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    static int[] quicksort(int[] arr,int low,int high) {
    	if(low<high) {
    		int p=partition(arr,low,high);
    		quicksort(arr,low,p-1);
    		quicksort(arr,p+1,high);
    	}
        return arr;
    }
    public static void main(String[] args) {
    	int[] arr= {12,2,1,34,32,54,5};
    	int[] ans=quicksort(arr,0,arr.length-1);
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(ans[i]+" ");
    	}
    }
}
