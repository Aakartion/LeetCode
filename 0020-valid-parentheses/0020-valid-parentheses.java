class Solution {
    public boolean isValid(String s) {
        char [] braces = s.toCharArray();
        if(braces[0]==')'||braces[0]=='}'||braces[0]==']'){
            return false;
        }
        
        Stack<Character> braceStack = new Stack<>();
        for(char brace : braces){
            if(braceStack.isEmpty()){
                braceStack.push(brace);
            }
            else{
                if((brace == ')' && braceStack.peek()=='(')||
                   (brace == '}' && braceStack.peek()=='{')||
                   (brace == ']' && braceStack.peek()=='[')){
                    braceStack.pop();
                }
                else{
                    braceStack.push(brace);
                }
            }
        }
        return braceStack.isEmpty();
    }
   
}