package Test;

public class maxsubarrayofsizek {
   static int maxsum(int[] arr,int k) {
	   int sum=0;
	   int max=0;
	   for(int i=0;i<k;i++) {
		   sum+=arr[i];
		   max=sum;
	   }
	   int j=0;
	   int n=k;
	   for(int m=n;m<arr.length;m++) {
		   sum+=arr[m];
		   sum-=arr[j];
		   j++;
		   max=Math.max(max, sum);
	   }
	   return max;
   }
   public static void main(String[] args) {
	   int[] arr= {12,2,4,54,-23,0,22};
	   System.out.println(maxsum(arr,5));
   }
}
