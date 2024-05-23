class Solution {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n==2)
            return 2;
        int oneStep = 1;
        int twoStep = 2;
        int result = 0;
        for(int i =0; i<n-2;i++){
            result = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = result;
        }
        return result;
    }
}