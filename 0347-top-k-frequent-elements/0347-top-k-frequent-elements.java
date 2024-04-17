class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> freqMap = new HashMap<>();
//         for(int num: nums){
//             if(!freqMap.containsKey(num)){
//                 freqMap.put(num, 1);
//             }
//             freqMap.put(num, freqMap.get(num)+1);
//         }
        
//         List<Integer> [] bucket = new List[nums.length+1];
//         for(int num: freqMap.keySet()){
//             int index = freqMap.get(num);
//             if(bucket[index]==null){
//                 bucket[index] = new ArrayList<>();
//             }
//             bucket[index].add(num);
//         }
        
//         int [] resultArray = new int [k];
//         int index = 0;
//         for(int i = bucket.length -1 ; i >= 0 && index<k; i--){
//             if(bucket[i]!=null){
//                 for(int num: bucket[i]){
//                     resultArray[index] = num;
//                     index++;
//                     if(index == k){
//                         break;
//                     }
//                 }
                
                
//             }
//         }
//         return resultArray;
        
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int num : nums) {
            numFrequencyMap.put(num, numFrequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : numFrequencyMap.keySet()) {
            int frequency = numFrequencyMap.get(num);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
        
    }
}