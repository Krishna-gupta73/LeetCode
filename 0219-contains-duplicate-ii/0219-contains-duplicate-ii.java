import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            // Check if duplicate exists in current window
            if (set.contains(nums[right])) {
                return true;
            }

            // Add current element
            set.add(nums[right]);

            // Keep window size at most k
            if (set.size() > k) {
                set.remove(nums[right - k]);
            }
        }

        return false;
    }
}