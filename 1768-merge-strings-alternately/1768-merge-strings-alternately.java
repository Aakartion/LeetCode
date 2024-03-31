class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxLength = 0;
        StringBuilder result = new StringBuilder();
        while(maxLength<word1.length() || maxLength<word2.length()){
            if(maxLength<word1.length()){
                result.append(word1.charAt(maxLength));
            }
            if(maxLength<word2.length()){
                result.append(word2.charAt(maxLength));
            }
            maxLength ++;
        }
        return result.toString();
    }
}