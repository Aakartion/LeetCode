class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        
        for(String str: strs){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            
            if(!anagramMap.containsKey(sortedString)){
                anagramMap.put(sortedString, new ArrayList<>());
            }
            
            anagramMap.get(sortedString).add(str);
        }
        List<List<String>>result = new ArrayList<>();
        for(List<String>list: anagramMap.values()){
            result.add(list);
        }
        return result;
        
}
}