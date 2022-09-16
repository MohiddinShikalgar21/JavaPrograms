package Test;

public class towerofhanoi {
    static void towerofhanoi(int n,char from,char to,char mid) {
    	if(n==0) return;
    	towerofhanoi(n-1,from,mid,to);
    	System.out.println("Move "+n+" from "+from+" to "+to);
    	towerofhanoi(n-1,mid,to,from);
    }
    public static void main(String[] args) {
    	int n=4;
    	towerofhanoi(n,'A','C','B');
    }
}
