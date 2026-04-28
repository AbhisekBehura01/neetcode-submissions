class Solution {
    
    
    public int rob(int [] nums ){
        int n = nums.length;
        int prev2 = 0 ;
        int prev = nums[0] ;

        for (int i = 1; i < n; i++){
            int take = nums [i ] + prev2;
            int not_take = 0 + prev ;

            int curr = Math.max(take, not_take) ;
            prev2 = prev ;
            prev = curr;
        }

        return prev;
}
}
