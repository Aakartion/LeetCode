class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        int tempCounter = 0;
        
        Set<Character> stringContainer = new HashSet<>();
        
        char [] stringArray = s.toCharArray();
        
//         for(int i = 0; i< stringArray.length; i++){
//             System.out.println(stringArray[i]);
//             // tempCounter = right - left;+
            
//             if(tempCounter > result){
//                 result = tempCounter;
//             }
            
//             if(!stringContainer.contains(stringArray[i])){
//                 stringContainer.add(stringArray[i]);
//                 right ++;
//             }
//             else{
//                 left ++;
//                 // right ++;
//             }
            
//             tempCounter = right - left;
//             System.out.println(" this is i: " + i);
//         }
//         System.out.println("This is temp Counter: " + tempCounter);
//         System.out.println("This is RIght: " + right + " And this is left: " + left);
//         if(tempCounter > result){
//                 result = tempCounter;
//             }
        
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