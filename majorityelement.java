package Test;
import java.util.Arrays;
public class majorityelement {
    static int majorityelement(int[] arr) {
    	Arrays.sort(arr);
    	int maxcount=0;
    	int curcount=1;   	
    	int element=-1;
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]==arr[i-1]) {
    			curcount++;
    			if(curcount>maxcount) {
    		    	maxcount=curcount;
    		    	element=arr[i];  		    	
    			}
    		}
    		else if(arr[i]!=arr[i-1]) {
    		    	curcount=1;
    		}
    	}
    	if(maxcount>arr.length/2) return element;
    	else return -1;
    }
    public static void main(String[] args) {
    	int[] arr= {78,5,5,12,5,4,5,32,12,5,12,5,5};
    	System.out.println(majorityelement(arr));
    }
}
