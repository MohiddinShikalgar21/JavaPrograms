package Test;

public class sort {
	
	//QUICK SORT
    static int quickpartition(int[] arr,int low,int high) {
    	int pivot=high;
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
    		int p=quickpartition(arr,low,high);
    		quicksort(arr,low,p-1);
    		quicksort(arr,p+1,high);
    	}
    	return arr;
    }
    
    //MERGE SORT
    static void partition(int[] arr,int low,int high) {
    	int mid=(low+high)/2;
    	partition(arr,low,mid);
    	partition(arr,mid+1,high);
    	merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high) {
    	int n1=mid-low+1;
    	int n2=high-mid;
    	int[] left=new int[n1];
    	int[] right=new int[n2];
    	for(int i=0;i<n1;i++) {
    		left[i]=arr[i+low];
    	}
    	for(int i=0;i<n2;i++) {
    		right[i]=arr[mid+1+i];
    	}
    	int i=0,j=0,k=low;
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
    		j++;k++;
    	}
    }
    static int[] mergesort(int[] arr) {
    	partition(arr,0,arr.length-1);
    	return arr;
    }
    
    //SELECTION SORT
    static int[] selectionsort(int[] arr) {
    	for(int i=0;i<arr.length-1;i++) {
    		int min=arr[i];
    		int index=i;
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[j]<min) {
    				min=arr[j];
    				index=j;
    			}
    		}
    		swap(arr,i,index);
    	}
    	return arr;
    }
    
    //INSERTION SORT
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
    
    //BUBBLE SORT
    static int[] bubblesort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr.length-i-1;j++) {
    			if(arr[j+1]<arr[j]) {
    				swap(arr,j,j+1);
    			}
    		}
    	}
    	return arr;
    }
}
