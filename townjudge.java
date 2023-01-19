package Test;

public class townjudge {
	static int findjudge(int n, int[][] trust){
        int[] trusted = new int[n+1];
        for(int[] person : trust){
            trusted[person[0]]--;
            trusted[person[1]]++;
        }
        for(int i=1;i<trusted.length;i++){
            if(trusted[i]==n-1) return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		int[][] arr= {{1,3},{2,1},{2,3},{2,4},{4,1},{4,3},{5,3}};
		int n=5;
		System.out.println(findjudge(n,arr));
	}
}
