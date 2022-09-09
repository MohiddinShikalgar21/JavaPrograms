package Test;

public class waterjug {
    static void filljug(int[] arr,int n){
    	if(n==1) arr[0]=4;
    	else if(n==2) arr[1]=3;
    }
    static void emptyjug(int[] arr,int n) {
    	arr[n-1]=0;
    }
    static void movewaterAtoB(int[] arr) {
    	int n=arr[0];
    	if(arr[1]+n<=3) { arr[1]+=n; arr[0]=0; }
    	else { arr[1]=3; arr[0]=Math.abs(3-n); }
    }
    static void movewaterBtoA(int[] arr) {
    	int n=arr[1];
    	int temp=arr[0];
    	if(arr[0]+n<=4) { arr[0]+=n; arr[1]=0; }
    	else { arr[0]=4; arr[1]=temp-Math.abs(4-n); }
    }
    public static void main(String[] args) {
    	int[] arr= {4,3};
    	emptyjug(arr,2);
    	
    	movewaterAtoB(arr);
    	
    	emptyjug(arr,1);
    	
    	movewaterBtoA(arr);
    	
    	filljug(arr,2);
    	
    	movewaterBtoA(arr);
    	
    	emptyjug(arr,1);
    	
    	movewaterBtoA(arr);
    	
    	System.out.println(arr[0]);
    }
    	
}
