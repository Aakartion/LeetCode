class Solution {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n==2)
            return 2;
        int oneStep = 1;
        int twoStep = 2;
        int result = 0;
        for(int i =1; i<n-1;i++){
            result = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = result;
        }
        return result;
    }
}