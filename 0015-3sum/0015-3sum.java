class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // Set target to find complement
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    // Found triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Move left pointer
                } else {
                    right--; // Move right pointer
                }
            }
        }
        return result;
    }
}
