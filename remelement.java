package Test;

public class remelement {
    static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
                }
            
        }
        for(int m=0;m<nums.length;m++) {
        System.out.print(nums[m]+" ");}
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
    	int val=3;
    	int[] arr= {2,3,2,3,3,3,4,5,6};
    	System.out.println(removeElement(arr,val));
    }
}