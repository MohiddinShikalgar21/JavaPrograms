package Test;
import java.util.HashMap;

public class majorityelementoptimized {
     static int findmajor(int[] n) {
    	 int max=0;
    	 int temp=-1;
    	 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	 for(int i:n) {
    		 if(map.containsKey(i)) {
    			 map.put(i, map.get(i)+1);
    		 }
    		 else map.put(i, 1);
    		 if(map.get(i)>max) {
    			 max=map.get(i);
    			 temp=i;
    		 }
    	}
    	 if(max>n.length/2) return temp;
		 else return -1;
     }
     public static void main(String[] args) {
    	 int[] arr= {78,5,5,12,5,4,5,32,12,5,12,5,5};
     	 System.out.println(findmajor(arr));
     }
}
