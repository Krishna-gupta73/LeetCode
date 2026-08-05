class Solution {

    public int minimumRecolors(String blocks, int k) {

        int white = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            }
        }

        int ans = white;

        // Slide window
        for (int i = k; i < blocks.length(); i++) {

            // Remove left
            if (blocks.charAt(i - k) == 'W') {
                white--;
            }

            // Add right
            if (blocks.charAt(i) == 'W') {
                white++;
            }

            ans = Math.min(ans, white);
        }

        return ans;
    }
}