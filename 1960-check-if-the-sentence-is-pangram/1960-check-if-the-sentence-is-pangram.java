class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> pangramSet = new HashSet<>();
        for(int i = 0; i< sentence.length();i++){
            pangramSet.add(sentence.charAt(i));
        }
        if(pangramSet.size()==26){
            return true;
        }
        return false;
    }
}