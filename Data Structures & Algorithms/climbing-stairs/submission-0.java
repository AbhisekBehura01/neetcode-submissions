class Solution {
    public int climbStairs(int n){
        int dp[] = new int [n+1];
        return helper(n, dp);

    }
    public int helper(int n ,int dp[]) {
       if(n == 0 ) return 0;
       if(n == 1 ) return 1;
       if(n == 2 ) return 2;
       if(dp[n]!= 0 ) return dp[n];
       int climb = helper(n -1,dp);
       int skip = helper(n -2 ,dp);
       dp[n] = climb + skip ;
       return dp[n];
    }

    
}
