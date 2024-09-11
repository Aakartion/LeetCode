class Solution {
    public int firstUniqChar(String s) {
        int [] totalLetter = new int [26];
        for(int i=0;i<s.length();i++){
            totalLetter[(s.charAt(i)-'a')] = totalLetter[s.charAt(i)-'a']+1;
        }
        for(int i=0; i<s.length();i++){
            if(totalLetter[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}



// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> characterFreq = new HashMap<>();
//         for(int i =0; i<s.length();i++){
//             characterFreq.put(s.charAt(i), characterFreq.getOrDefault(s.charAt(i),0)+1);
//         }
//         System.out.println(characterFreq);
//         for(int i = 0; i<s.length();i++){
//             if(characterFreq.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
