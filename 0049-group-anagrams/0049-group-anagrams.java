class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for(String str:strs){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString, new ArrayList<>());
            }
            hashMap.get(sortedString).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String>strList: hashMap.values()){
            result.add(strList);
        }
        return result;
    }
}
