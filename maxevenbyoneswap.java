package Test;

import java.util.Arrays;

public class maxevenbyoneswap {
  static String maxeven(String s) {
	  char[] arr=s.toCharArray();
	  int n=arr[arr.length-1]-'0';
	  for(int i=0;i<arr.length-1;i++) {
		  int m=arr[i]-'0';
		  if(m%2==0 && m<n) { 
			  swap(arr,i,n-1);
			  break;
		  }
	  } 
	  String ans=new String(arr);
	  return ans;
  }
  static void swap(char[] arr,int i,int j) {
	  char temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
  public static void main(String[] args) {
	  String s="13245";
	  System.out.println(maxeven(s));
  }
}
