package Test;

import java.util.*;

public class josephusarray {
    public static void main(String[] args) {
    	int[] arr=new int[10];
        for(int i=0;i<10;i++) {
        	arr[i]=i+1;
        }
        int a=josephus2(arr,10,0,1);
        System.out.println(a);
        int n=10;
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        	l.add(i+1);
        }
        int ans=josephus(l,0,1);
        System.out.println(ans);
        LinkedList<Integer> l2=new LinkedList<Integer>();
        for(int i=0;i<10;i++) {
        	l2.add(i+1);
        }
        int ans2=josephus3(l2,0,1);
        System.out.println(ans);
    }
    
    static int josephus(List<Integer> l,int i,int k) {
    	if(l.size()==1) return l.get(0);
    	i=(i+k)%l.size();
    	l.remove(i);
    	return josephus(l,i,k);
    }
    static int josephus2(int[] arr,int n,int i,int k) {
    	if(n<2) return arr[0];
    	i=(i+k)%n;
    	for(int i1=i;i1<n-1;i1++) {
    		arr[i1]=arr[i1+1];
    	}
    	n--;
//    	for(int j=0;j<arr.length;j++) {
//    		System.out.print(arr[j]+" ");
//    	}
//    	System.out.println();
    	return josephus2(arr,n,i,k);
    }
    static int josephus3(LinkedList<Integer> l,int i,int k) {
    	//LinkedList<Integer> l=new LinkedList<Integer>();
    	if(l.size()==1) return l.get(0);
    	//System.out.println(l.size());
    	i=(i+k)%l.size();
    	l.remove(i);
    	return josephus3(l,i,k);
    }

static int josephus2(int[] arr,int k) {
	    Arrays.fill(arr,1);
		int i=k;
    	int ans=-1;
    	int count=0;
    	int temp=0;
    	while(count<arr.length) {
    		  while(arr[i++%arr.length]!=0) { arr[(i)%arr.length]=0; count++; temp=i++;}
    		    i=temp%arr.length;
    		    ans=(i+3)%arr.length;
    		    i++;
    		    System.out.println(arr[ans]);
    	}
    	return ans;
}
static int sum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	return sum;
}
}