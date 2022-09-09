package Test;

public class nqueens {
    static boolean nqueens(int[][] arr,int row,int n) {
    	if(row==n) return true;
    	for(int i=0;i<n;i++) {
    		if(issafe(arr,row,i)==true) {
    			arr[row][i]=1;
    		
    		if(nqueens(arr,row+1,n)) return true;
    			arr[row][i]=0;
    		}	
    		
    	}
    	return false;
    }
    static boolean issafe(int[][] arr,int row,int col) {
    	for(int i=0;i>row;i++) {
    		if(arr[i][col]==1) return false;
    	}
    	for(int j=0;j<row;j++) {
    		for(int k=0;k<col;k++) {
    			if(arr[j][k]==1) return false;
    		}
    	}
    	return true;
    }
    public static void main(String[] args) {
    	int n=4;
    	int[][] arr= new int[4][4];
    	boolean nqueen= nqueens(arr,0,3);
    	for(int i=0;i<4;i++) {
    		for(int j=0;j<4;j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
