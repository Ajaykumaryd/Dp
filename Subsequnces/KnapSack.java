package Subsequnces;
import java.util.*;
public class KnapSack {

    static int knapSack(int W, int wt[], int val[], int n)
    {

        int dp[][]=new int[n][W+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return knapsack1(W,wt,val,n-1,dp);
    }

    static int knapsack1(int W, int wt[], int val[], int ind,int dp[][]) {

        if(ind == 0){
            if(wt[0] <=W) return val[0];
            else return 0;
        }

        if(dp[ind][W]!=-1)
            return dp[ind][W];

        int notTaken = 0 + knapsack1(W,wt,val,ind-1,dp);

        int taken = Integer.MIN_VALUE;
        if(wt[ind] <= W)
            taken = val[ind] + knapsack1(W-wt[ind],wt,val,ind-1,dp);

        return dp[ind][W] = Math.max(notTaken,taken);

    }

    static int knapSackdp(int W, int w[], int val[], int n)
    {

        int dp[][]=new int[n][W+1];

        for(int i=w[0];i<=W;i++){
            dp[0][i]=val[0];
        }

        for(int i=1;i<n;i++){
            for(int wt=0;wt<=W;wt++){

                int notTaken = 0 + dp[i-1][wt];

                int taken = Integer.MIN_VALUE;
                if(w[i] <= wt)
                    taken = val[i] + dp[i-1][wt-w[i]];

                dp[i][wt] = Math.max(notTaken,taken);


            }
        }
        return dp[n-1][W];






    }










    public static void main(String[] args) {

    }
}
