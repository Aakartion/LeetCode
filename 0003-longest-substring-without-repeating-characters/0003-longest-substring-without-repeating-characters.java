class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        Set<Character> stringContainer = new HashSet<>();
        char [] stringArray = s.toCharArray();
        
        while (right < stringArray.length) {
            char currentChar = stringArray[right];
            if (!stringContainer.contains(currentChar)) {
                stringContainer.add(currentChar);
                right++;
                result = Math.max(result, right - left);
            } else {
                stringContainer.remove(stringArray[left]);
                left++;
            }
        }
        return result;
    }
}