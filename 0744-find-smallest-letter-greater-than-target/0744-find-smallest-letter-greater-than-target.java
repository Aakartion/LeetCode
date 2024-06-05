class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
   int start=0;
   int end=letters.length-1;


   while(start<=end){
      int mid=start+ ((end-start)/2);
      
       if(letters[mid]>=(char)(target+1)){
          ans= letters[mid];
          end=mid-1;
       }else if(letters[mid]>(char)(target+1)){
           end=mid-1;
       }else{
           start=mid+1;
       }

   }
   return ans;
    }
}