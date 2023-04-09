package Test;

import java.util.*;

class pair{
    int start;
    int end;
    public pair(int start,int end) {
    	this.start=start;
    	this.end=end;
    }
}
public class nonoverlappingintervals {
    static int findinterval(int[][] arr,Set<pair> set) {
    	Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[0] - b[0];
            }
        });
    	int count=0;
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i-1][1]>arr[i][0]) 
    		{
    			count++;
    			pair p=new pair(arr[i][0],arr[i-1][1]);
    			set.add(p);
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		int[][] arr= {{2,5},{5,6},{1,8},{7,9},{4,5}};
		Set<pair> set=new HashSet<pair>();
		int n=findinterval(arr,set);

		System.out.println(n);
		for(pair p:set) {
			System.out.println(p.start+","+p.end);
		}
	}
}
