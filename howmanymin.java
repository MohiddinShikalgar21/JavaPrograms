package Test;
import java.util.*;

public class howmanymin {
static int[] smallerNumbersThanCurrent(int[] nums) {
	    int[] temp=new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, temp.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(temp[0],0);
        int count=0;
        int dup=1;
        for(int i=1;i<temp.length;i++){
            if(temp[i]>temp[i-1]){
                count++;
                map.put(temp[i],count);
            }
            else if(temp[i]==temp[i-1] && i<temp.length-1 && temp[i+1]==temp[i]){
                dup++;
            }
            else if(temp[i]==temp[i-1] && i<temp.length-1 && temp[i+1]>temp[i]){
                map.put(temp[i],count);
                count=count+dup;
                dup=1;
            }
            else if(i==temp.length-1 && temp[i]==temp[i-1]){
                map.put(temp[i],count);
            }
        }
        int[] ans=new int[nums.length];
        int k=0;
        for(int j:nums){
            ans[k++]=map.get(j);
        }
        
        return ans;
    }
public static void main(String[] args) {
	int[] nums= {8,1,2,2,3};
	int[] ans=smallerNumbersThanCurrent(nums);
	for(int i=0;i<ans.length;i++) {
		System.out.print(" "+ans[i]+" ");
	}
}
}