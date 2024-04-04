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

// public static List<List<String>> groupAnagram(String[] strs) {
//         List<List<String>> listOfAnagramStringsList = new ArrayList<>();
//         if (strs.length == 0) {
//             return listOfAnagramStringsList;
//         }

//         for (String str : strs) {
//             boolean checker = false;
//             if (listOfAnagramStringsList.isEmpty()) {
//                 List<String> sList = new ArrayList<>();
//                 sList.add(str);
//                 listOfAnagramStringsList.add(sList);
//             } else {
//                 for (int i = 0; i < listOfAnagramStringsList.size(); i++) {
//                     if (isAnagram1(str, listOfAnagramStringsList.get(i).get(0))) {
//                         listOfAnagramStringsList.get(i).add(str);
//                         checker = true;
//                         break;
//                     }
//                 }
//                 if (checker == false) {
//                     List<String> stringList = new ArrayList<>();
//                     stringList.add(str);
//                     listOfAnagramStringsList.add(stringList);
//                 }

//             }
//         }
//         return listOfAnagramStringsList;
//     }

//     public static Boolean isAnagram1(String s1, String s2) {
//         if (s1.length() != s2.length()) {
//             return false;
//         }
//         Map<Character, Integer> wordMap = new HashMap<>();
//         for (int i = 0; i < s1.length(); i++) {
//             wordMap.put(s1.charAt(i), wordMap.getOrDefault(s1.charAt(i), 0) + 1);
//         }
//         for (int i = 0; i < s2.length(); i++) {
//             wordMap.put(s2.charAt(i), wordMap.getOrDefault(s2.charAt(i), 0) - 1);
//         }
//         for (int count : wordMap.values()) {
//             if (count != 0) {
//                 return false;
//             }
            
//         }
//         return true;

//     }