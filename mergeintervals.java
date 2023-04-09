package Test;
import java.util.*;

public class mergeintervals {
    static int[][] merge(int[][] arr) {
    	Arrays.sort(arr,(i1,i2)->Integer.compare(i1[0],i2[0]));
    	List<int[]> l=new ArrayList<int[]>();
    	int[] temp=arr[0];
    	l.add(temp);
    	for(int[] i:arr) {
    		if(i[0]<=temp[1]) {
    			temp[1]=Math.max(i[1],temp[1]);
    		}
    		else {
    			temp=i;
    			l.add(temp);
    		}
    	}
    	return l.toArray(new int[l.size()][]);
    }
    public static void main(String[] args) {
    	int[][] arr= {{1,4},{51,55},{2,4},{5,8},{6,22},{54,56}};
    	int[][] optimizedarr=merge(arr);
        for(int i=0;i<optimizedarr.length;i++) {
        	for(int j=0;j<optimizedarr[0].length;j++) {
        		System.out.print(optimizedarr[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
