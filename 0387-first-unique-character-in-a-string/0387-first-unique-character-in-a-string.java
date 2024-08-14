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

        int[] count = new int[26];  

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); 
            int index = currentChar - 'a'; 
            count[index] = count[index]+ 1;                   
        }


        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}