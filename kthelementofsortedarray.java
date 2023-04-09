package Test;

import java.util.Arrays;

public class kthelementofsortedarray {
    static int findk(int[] arr1,int[] arr2,int k) {
    	int i=0,j=0,n=0;
    	int[] arr=new int[arr1.length+arr2.length];
    	while(i<arr1.length && j<arr2.length) {
    		if(arr1[i]<arr2[j]) {
    			arr[n]=arr1[i];
    			if(n==k) return arr[n];
    			i++;
    			n++;
    		}
    		else {
    			arr[n]=arr2[j];
    			if(n==k) return arr[n];
    			j++;
    			n++;
    		}
    	}
    	while(i<arr1.length) {
    		arr[n]=arr1[i];
			if(n==k) return arr[n];
			i++;
			n++;
    	}
    	while(j<arr2.length) {
    		arr[n]=arr2[j];
			if(n==k) return arr[n];
			j++;
			n++;
    	}
    	return -1;
    }
    public static void main(String[] args) {
    	int[] arr1= {12,2,32,4,54,23};
    	int[] arr2= {22,34,1};
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	int ans=findk(arr1,arr2,2);
    	System.out.println(ans);
    	
    }
}
