package Test;
import java.util.*;
import java.util.Arrays;

public class mergesortedarrays {
    static int[] mergearrrays(int[] arr1,int[] arr2) {
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	int i=0;
    	int j=0;
    	int k=0;
    	int[] arr3= new int[arr1.length+arr2.length];
    	while(i<arr1.length && j<arr2.length) {
    		if(arr1[i]>arr2[j]) {
    			arr3[k++]=arr2[j++];
    		}
    		else {
    			arr3[k++]=arr1[i++];
    		}
    	}
    	while(i<arr1.length) {
    		arr3[k++]=arr1[i++];
    	}
    	while(j<arr2.length) {
    		arr3[k++]=arr2[j++];
    	}
    	return arr3;
    }
    public static void main(String[] args) {
    	int[] array1= {12,1,11,34,7};
    	int[] array2= {14,15,3,18,9,2};
    	int[] ans= mergearrrays(array1,array2);
    	for(int n=0;n<ans.length;n++) {
    		System.out.print(ans[n]+" ");
    	}
    }
}
