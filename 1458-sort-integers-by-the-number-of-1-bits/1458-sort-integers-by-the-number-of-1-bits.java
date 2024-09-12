class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> bitMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            int bitValue = Integer.bitCount(arr[i]);
            bitMap.putIfAbsent(bitValue, new ArrayList<>());
            bitMap.get(bitValue).add(arr[i]);

        }
        List<Integer> numsList = new ArrayList<>();
        for (List<Integer> array : bitMap.values()) {
            Collections.sort(array);
            numsList.addAll(array);
        }
        // int[] result = new int[numsList.size()];
        int[] result = numsList.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}