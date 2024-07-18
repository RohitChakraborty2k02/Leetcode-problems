class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[] next = new int[s2.length() + 1];
        int[] count = new int[s2.length() + 1];
        int j = 0, cnt = 0;
        for (int k = 1; k <= n1; k++) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                    if (j == s2.length()) {
                        j = 0;
                        cnt++;
                    }
                }
            }
            count[k] = cnt;
            next[k] = j;
            for (int start = 0; start < k; start++) {
                if (next[start] == j) {
                    int prefixCount = count[start];
                    int patternCount = (count[k] - count[start]) * ((n1 - start) / (k - start));
                    int suffixCount = count[start + (n1 - start) % (k - start)] - count[start];
                    return (prefixCount + patternCount + suffixCount) / n2;
                }
            }
        }
        return count[n1] / n2;
    }
}