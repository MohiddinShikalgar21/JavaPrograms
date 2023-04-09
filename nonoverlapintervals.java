package Test;

import java.util.*;

public class nonoverlapintervals{
   static class interval{
      int start;
      int end;
      interval(int start,int end) {
    	  this.start=start;
    	  this.end=end;
      }
   }
    static int findinterval(int[][] arr,Set<interval> set,ArrayList<interval> l) {
    	Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[1]-b[1];
            }
        });
    	Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[0]-b[0];
            }
        });
    	int count=0;
    	int prev=arr[0][1];
    	for(int i=1;i<arr.length;i++) {
    		//System.out.print(arr[i][0]+" "+arr[i][1]);
    		if(arr[i][0]<prev) 
    		{
    			count++;
    			interval p=new interval(arr[i][0],prev);
    			set.add(p);
    			l.add(p);
    		}
    		else prev=arr[i][1];
    	}
    	return count;
    }

	public static void main(String[] args) {
		int[][] arr= {{2,5},{5,9},{7,18},{8,9},{11,15}};
		Set<interval> set=new HashSet<interval>();
		ArrayList<interval> l=new ArrayList<interval>();
		int n=findinterval(arr,set,l);

		System.out.println(n);
		for (int i = 0; i < l.size(); i++)
	    {
	        System.out.println(l.get(i).start +","+l.get(i).end);
	    }
	}
}
