/*In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, 
then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.*/

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
