class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int k = s1.length();

        // First window
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (same(freq1, freq2)) {
            return true;
        }

        // Slide window
        for (int i = k; i < s2.length(); i++) {

            // Remove left character
            freq2[s2.charAt(i - k) - 'a']--;

            // Add right character
            freq2[s2.charAt(i) - 'a']++;

            if (same(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    private boolean same(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {

            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}