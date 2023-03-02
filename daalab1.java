package Test;

public class daalab1 {
    public static void main(String[] args) {
    	int[][] arr={{2,1,4},{1,5,6},{4,6,2},{7,2,6}};
    	int[] maxcol=new int[arr[0].length];
    	for(int i=0;i<arr[0].length;i++) {
    		int max=arr[0][i];
    		for(int j=1;j<arr.length;j++) {
    			max=Math.max(max,arr[j][i]);
    		}
    		maxcol[i]=max;
    	}
    	int[] minrow=new int[arr.length];
    	for(int i2=0;i2<arr.length;i2++) {
    		int min=arr[i2][0];
    		for(int j2=1;j2<arr[0].length;j2++) {
    			min=Math.min(min,arr[i2][j2]);
    		}
    		minrow[i2]=min;
    	}
    	System.out.println(saddlepoint(arr,maxcol,minrow));
    }
    static int saddlepoint(int[][] arr,int maxcol[],int[] minrow) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[0].length;j++) {
    			if(arr[i][j]==minrow[i] && arr[i][j]==maxcol[j]) return arr[i][j];
    		}
    	}
    	return -1;
    }
}
