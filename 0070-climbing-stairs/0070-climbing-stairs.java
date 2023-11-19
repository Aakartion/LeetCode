class Solution {
    public int climbStairs(int n) {
            int one = 1;
            int two = 2;
            if(n==1){
                return one;
            }
            if(n==2){
                return 2;
            }
            int result = 0;
            for(int i =0; i<n-2;i++){
                result = one + two;
                one = two;
                two = result;
            }
            return result;
    }
}