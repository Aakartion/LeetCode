class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int last = s.length() - 1;
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return true;
        }
        while (first < last) {
            if (s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                return false;
            }

        }
        return true;
    }
}