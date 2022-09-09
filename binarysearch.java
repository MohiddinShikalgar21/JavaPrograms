package Test;

import java.util.Arrays;

public class binarysearch {
    static int binarysearch(int[] arr,int n) {
    	Arrays.sort(arr);
    	int first=0;
    	int last=arr.length-1;
    	int mid=(first+last)/2;
    	if(arr[mid]==n) return mid;
    	else if(n>arr[mid]) {
    		first=mid+1;
    		return binarysearch(arr,n);
    	}
    	else {
    		last=mid-1;
    		return binarysearch(arr,n);
    	}
    }
}
