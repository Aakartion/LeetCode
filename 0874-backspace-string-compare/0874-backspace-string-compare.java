class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sCharWithoutHash = getStringAfterBackspace(s);
        Stack<Character> tCharWithoutHash = getStringAfterBackspace(t);
        if(sCharWithoutHash.size()!=tCharWithoutHash.size()){
            return false;
        }
        while(!sCharWithoutHash.isEmpty()){
            if(sCharWithoutHash.pop()!=tCharWithoutHash.pop()){
                return false;
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