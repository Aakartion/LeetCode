class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        for(int i = 0; i< s.length();i++){
            if(!characterMap.containsKey(s.charAt(i))){
                characterMap.put(s.charAt(i), 1);
            }else{
                characterMap.put(s.charAt(i), characterMap.get(s.charAt(i))+1);
            }
        }
        for(int i = 0; i<s.length();i++){
            if(characterMap.get(s.charAt(i))==1){
                return i;
            }
        }
        System.out.println(characterMap);
        return -1;
    }
}