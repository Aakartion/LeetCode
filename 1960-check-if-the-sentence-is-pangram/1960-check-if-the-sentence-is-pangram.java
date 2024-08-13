class Solution {
    public boolean checkIfPangram(String sentence) {
        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> letters = new HashSet<>();

        for(char c: sentence.toLowerCase().toCharArray()){
            letters.add(c);
            // if(ALPHABET.indexOf(c)!= -1){
            //     letters.add(c);
            // }
        }

        for(char c: ALPHABET.toCharArray()){
            if(!letters.contains(c)){
                return false;
            }
        }
        return true;
    }
}