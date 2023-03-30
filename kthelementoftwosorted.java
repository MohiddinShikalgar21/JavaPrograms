package Test;

import java.util.Arrays;

public class kthelementoftwosorted {
    static int kthelement(int[] arr1,int[] arr2,int n) {
    	int i=0,j=0;
    	int count=0;
    	int k=0;
    	int[] arr=new int[arr1.length+arr2.length];
    	while(i<arr1.length || j<arr2.length) {
    		if(arr1[i]<arr2[j]) {
    			arr[k]=arr1[i];
    			if(k==n) return arr[k];
    			k++;i++;
    		}
    		else{
    			arr[k]=arr2[j];
    			if(k==n) return arr[k];
    			k++;j++;
    		}
    	}
    	while(i<arr1.length) {
    		arr[k]=arr[i];
    		if(k==n) return arr[k];
    		i++;k++;
    	}
    	while(j<arr2.length) {
    		arr[k]=arr2[j];
    		if(k==n) return arr[k];
    		j++;k++;
    	}
    	return -1;
    }
    public static void main(String[] args) {
    	int[] arr1= {12,2,3,32,4,66,1,0};
    	int[] arr2= {11,13,5,98,-23,22};
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	System.out.println(kthelement(arr1,arr2,4));
    }
}

