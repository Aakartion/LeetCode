class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int [temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int currTempIndex = 0 ; currTempIndex<temperatures.length; currTempIndex++){
            if(stack.isEmpty()){
                stack.push(currTempIndex);
            }
            else{
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[currTempIndex]){
                    int prevTempIndex = stack.pop();
                    result[prevTempIndex] = currTempIndex - prevTempIndex;
                }
                stack.push(currTempIndex);
            }
        }
        return result;
        
    }
}