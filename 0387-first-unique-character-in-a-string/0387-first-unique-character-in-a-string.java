class Solution {
    public int firstUniqChar(String s) {
        // Solution 1:
        // Map<Character, Integer> characterMap = new HashMap<>();
        // for(int i = 0; i< s.length();i++){
        //     if(!characterMap.containsKey(s.charAt(i))){
        //         characterMap.put(s.charAt(i), 1);
        //     }else{
        //         characterMap.put(s.charAt(i), characterMap.get(s.charAt(i))+1);
        //     }
        // }
        // for(int i = 0; i<s.length();i++){
        //     if(characterMap.get(s.charAt(i))==1){
        //         return i;
        //     }
        // }
        // return -1;

        // Solution 2:

        int[] count = new int[26];  // Array to store frequency of each character

        // First pass: populate the frequency array
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second pass: find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // If no unique character is found
        return -1;
    }
}