package Test;
import java.util.*;
public class twosum {
    static int[] solution(int[] arr,int target)
    {
    	int j=0;
    	int x=0;
    	int y=0;
    	int[] arr2= new int[2];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i!=j) {
    		int n=target-arr[i];
    		if(arr[j]==n)
    		{
    			x=i;
    			y=j;
    			break;
    		}
    		else j++;
    		}
    		else continue;
    	}
    	arr2[0]=x;
		arr2[1]=y;
    	return arr2;
    }
    public static  void main(String[] args)
    {
    	int[] a= {2,5,1,9,13};
    	int tar=11;
    	int[] ans= solution(a,tar);
    	System.out.println(solution(a,tar));
    }
}
