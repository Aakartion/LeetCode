class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.getOrDefault(num, 0) + 1);
            } else {
                numMap.put(num, 1);
            }

        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(numMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry2.getValue() - entry1.getValue(); // Compare in descending order
            }
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }
}