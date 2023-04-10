package Test;

public class mergesort {
    static void partition(int[] arr,int start,int end) {
    	if(start<end) {
    	  int mid=(start+end)/2;
    	  partition(arr,start,mid);
    	  partition(arr,mid+1,end);
    	  merge(arr,start,mid,end);
    	}
    }
    static int[] mergesort(int[] arr) {
    	partition(arr,0,arr.length-1);
    	return arr;
    }
    static void merge(int[] arr,int start,int mid,int end) {
    	int n1=mid-start+1;
    	int n2=end-mid;
    	int[] left=new int[n1];
    	int[] right=new int[n2];
    	for(int i=0;i<n1;i++) {
    		left[i]=arr[start+i];
    	}
    	for(int i=0;i<n2;i++) {
    		right[i]=arr[mid+1+i];
    	}
    	int i=0,j=0,k=start;
    	while(i<n1 && j<n2) {
    		if(left[i]<right[j]) {
    			arr[k]=left[i];
    			i++;
    		}
    		else {
    			arr[k]=right[j];
    			j++;
    		}
    		k++;
    	}
    	while(i<n1) {
    		arr[k]=left[i];
    		i++;k++;
    	}
    	while(j<n2) {
    		arr[k]=right[j];
    		k++;j++;
    	}
    }
    public static void main(String[] args) {
    	int[] arr= {12,2,1,23,13,0,1,65,32};
    	int[] ans=mergesort(arr);
    	for(int i:ans) {
    		System.out.print(i+" ");
    	}
    }
}
