class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];
        for (char ch : s.toCharArray()) {
            counts[ch-'A']++;
        }
        int ans = 0;
        boolean odd = false;
        for (int count : counts) {
            
            if ((count & 1) == 1) {
                odd = true;
            }
            ans += (count/2) * 2;
        }
        return odd ? ans + 1: ans;
}
}