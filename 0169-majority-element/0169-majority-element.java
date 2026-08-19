class Solution {
    public int majorityElement(int[] nums) {
        int curr = 0;
        int candidate = 0;

        for (int num : nums) {
            if (curr == 0) {
                candidate = num;
            }

            if (num == candidate) {
                curr++;
            } else {
                curr--;
            }
        }

        return candidate;
    }
}