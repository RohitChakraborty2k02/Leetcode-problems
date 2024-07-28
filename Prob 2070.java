class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int[][] queryWithIdx = new int[queries.length][2];
        for (int i = 0;i < queries.length;i++) {
            queryWithIdx[i] = new int[]{queries[i], i};
        }
        Arrays.sort(queryWithIdx, (a, b) -> a[0] - b[0]);

        int p1 = 0;
        int p2 = 0;
        int[] ans = new int[queries.length];
        int maxSoFar = 0;
        while (p1 < items.length && p2 < queries.length) {
            while (p1 < items.length && items[p1][0] <= queryWithIdx[p2][0]) {
                maxSoFar = Math.max(maxSoFar, items[p1][1]);
                p1++;
            }
            ans[queryWithIdx[p2++][1]] = maxSoFar;
        }

        for (int i = p2;i < queries.length;i++) {
            ans[queryWithIdx[i][1]] = maxSoFar; 
        }
        return ans;
    }
}