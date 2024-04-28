class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack = new Stack<>();
        int result = 0;
        for(String token: tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                int num = Integer.parseInt(token);
                tokenStack.push(num);
            }
            else{
                if(token.equals("+")){
                    int firstPop = tokenStack.pop();
                    int secondPop = tokenStack.pop();
                    result = secondPop + firstPop;
                    tokenStack.push(result);
                }
                else if(token.equals("-")){
                    int firstPop = tokenStack.pop();
                    int secondPop = tokenStack.pop();
                    result = secondPop - firstPop;
                    tokenStack.push(result);
                }
                else if(token.equals("*")){
                    int firstPop = tokenStack.pop();
                    int secondPop = tokenStack.pop();
                    result = secondPop * firstPop;
                    tokenStack.push(result);
                }
                else{
                    int firstPop = tokenStack.pop();
                    int secondPop = tokenStack.pop();
                    result = secondPop / firstPop;
                    tokenStack.push(result);
                }
            }
            
        }
        return tokenStack.pop();
    }
    
}