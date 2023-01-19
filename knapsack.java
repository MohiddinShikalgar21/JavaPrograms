package Test;
public class knapsack {
    public static void main(String[] args) {
    	int[] wt= {1,3,4,6};
        int[] val= {20,30,10,50};
        int w=10;
        int n=4;
        int ans=knapsack(wt,val,w,n);
        System.out.println(ans);
    }
    static int knapsack(int[] wt, int[] val, int W, int N)
    {
        int[][] m = new int[N + 1][W + 1];
        int[][] sol = new int[N + 1][W + 1];
        for(int i=1;i<N;i++)
        {
            for(int j=0;j<=W;j++)
            {
                int m1 = m[i - 1][j];
                int m2 = Integer.MIN_VALUE; 
                if (j >= wt[i])
                    m2 = m[i - 1][j - wt[i]] + val[i];
                m[i][j] = Math.max(m1, m2);
                sol[i][j] = m2 > m1 ? 1 : 0;
            }
        }        
        int[] selected = new int[N + 1];
        for (int n=N, w=W; n>0;n--)
        {
            if (sol[n][w] != 0)
            {
                selected[n]=1;
                w=w-wt[n];
            }
            else {
                selected[n] = 0;
            }
        }
        System.out.print("Items with weight ");
        for (int i = 1; i < N + 1; i++) {
            if (selected[i] == 1) System.out.print(val[i] +" ");
        }
        System.out.println("are selected by knapsack algorithm.");
        
        return m[N-1][W];
    }
}