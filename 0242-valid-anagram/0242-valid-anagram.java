class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sWordChar = s.toCharArray();
        char[] tWordChar = t.toCharArray();
        Arrays.sort(sWordChar);
        Arrays.sort(tWordChar);
        return Arrays.equals(sWordChar, tWordChar);
    }
}