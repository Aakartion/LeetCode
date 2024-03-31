class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0){
            return word2;
        }
        else if(word2.length() == 0){
            return word1;
        }
        else{
            int maxLength = 0;
            String result = "";
            if(word1.length()>=word2.length()){
                maxLength = word1.length();
            }
            else{
                maxLength = word2.length();
            }
            for(int i =0; i<maxLength;i++){
                
                if(i<word1.length() || i>word1.length()){
                    if(i<word1.length()){
                        result = result + word1.charAt(i);
                    }
                }
                if(i<word2.length() || i>word2.length()){
                    if(i<word2.length()){
                        result = result + word2.charAt(i);
                    }
                }
            }
            return result;
        }
    }
}