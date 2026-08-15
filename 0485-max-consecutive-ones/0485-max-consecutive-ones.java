class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCountt = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                maxCountt = Math.max(maxCountt, count);
            } else {
                count = 0;
            }
        }

        return maxCountt;
    }
}