class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> [] bucket = new List[nums.length+1];
        
        for(int num: freqMap.keySet()){
            int freq = freqMap.get(num);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        
        int [] resultArray = new int [k];
        int index = 0;
        for(int i = bucket.length -1 ; i >= 0 && index<k; i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    resultArray[index] = num;
                    index++;
                    if(index == k){
                        break;
                    }
                }
                
                
            }
        }
        return resultArray;
    }
}