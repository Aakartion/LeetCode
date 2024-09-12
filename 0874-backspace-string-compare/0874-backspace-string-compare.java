class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sCharWithoutHash = getStringAfterBackspace(s);
        Stack<Character> tCharWithoutHash = getStringAfterBackspace(t);
        if(sCharWithoutHash.size()!=tCharWithoutHash.size()){
            return false;
        }
        int length = sCharWithoutHash.size();
        for(int i=0;i<length;i++){
            if(sCharWithoutHash.peek()!=tCharWithoutHash.peek()){
                return false;
            }
            else{
                sCharWithoutHash.pop();
                tCharWithoutHash.pop();
            }
        }
        
        return true;
    }

    public Stack<Character> getStringAfterBackspace(String str){
        Stack<Character> charStack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(charStack.isEmpty() && str.charAt(i)=='#'){}
            else if(str.charAt(i)!='#'){
                charStack.push(str.charAt(i));
            }else{
                charStack.pop();
            }
        }
        return charStack;
    }
}