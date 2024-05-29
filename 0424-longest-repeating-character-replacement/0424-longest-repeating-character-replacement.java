class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int result = 0;
        int count = 0;
        int windowLength = 0;
        Map<Character, Integer> alphabetMap = new HashMap<>();
        
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            alphabetMap.put(ch, alphabetMap.getOrDefault(ch,0) + 1);
            count = Math.max(count, alphabetMap.get(ch));
            windowLength = right - left + 1;
            int replacement = windowLength - count;
            if(replacement > k){
                char leftChar = s.charAt(left);
                alphabetMap.put(leftChar, alphabetMap.get(leftChar) -1);
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}