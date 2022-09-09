package Test;
import java.util.*;
public class infinitesearch {
    static int infsearch(int[] arr,int key) {
    	int first=0;
    	int last=1;
    	while(arr[last]<key) {
    		first=last;
    		last=2*last;
    	}
    	return binarysearch(arr,key,first,last);
    }
    static int binarysearch(int[] arr,int key,int first,int last) {
    	int mid= (first+last)/2;
    	int ans=-1;
    	if(arr[mid]==key) ans=mid;
    	else if(arr[mid]>key) {
    		last=mid-1;
    		return binarysearch(arr,key,first,last);
    	}
    	else {
    		first=mid+1;
    		return binarysearch(arr,key,first,last);
    	}
    	return ans;
    }
    public static void main(String[] args) {
    	int[] arr= {12,13,15,16,21,23,24,28,54,98,163,258,347};
    	Arrays.sort(arr);
    	System.out.println(infsearch(arr,54));
    }
}
