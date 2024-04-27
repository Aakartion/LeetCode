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
                    System.out.println("This is what is in the peek"+braceStack.peek());
                    char popped = braceStack.pop();
                    System.out.println("This is what is popped"+popped);
                    
                    // braceStack.pop();
                }
                else{
                    braceStack.push(brace);
                }
            }
        }
        return braceStack.isEmpty();
    }
   
}