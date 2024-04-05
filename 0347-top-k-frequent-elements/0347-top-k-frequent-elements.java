class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> numMap = new HashMap<>();
//         for (int num : nums) {
//             // if (numMap.containsKey(num)) {
//                 numMap.put(num, numMap.getOrDefault(num, 0) + 1);
//             // } else {
//             //     numMap.put(num, 1);
//             // }

//         }
//         List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(numMap.entrySet());
//         Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
//             public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
//                 return entry2.getValue() - entry1.getValue();
//             }
//         });
        
//         int[] result = new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i] = entryList.get(i).getKey();
//         }
//         return result;
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