class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int totalProd = 1;
        int zeroCount = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            if(zeroCount == 2){
                totalProd = 0;
                break;
            }
            if(nums[i]!=0 && zeroCount !=2){
                totalProd = totalProd * nums[i];
            }
            
        }
        System.out.println("This is totalProd:" + totalProd);
        System.out.println("This is zeroCount:" + zeroCount);
        int [] result = new int[(nums.length)];
        if(zeroCount == 2){
            return result;
        }
        for(int i = 0; i < nums.length; i++){
            if(zeroCount == 1){
                if(nums[i]==0){
                    result[i] = totalProd;
                }
                else{
                    result[i] = 0;
                }
            }
            else{
                result[i] = totalProd/nums[i];
            }
        }
        return result;
        
    }
}