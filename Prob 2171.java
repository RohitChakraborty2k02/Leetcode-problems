class Solution {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
		Arrays.sort(beans);
		long sum = 0;
		for (int i=0;i<n;i++) {
			sum += beans[i];
		}
		long res = Long.MAX_VALUE;
		for (int i=0;i<n;i++) {
			res = Math.min(res, sum - ((long) beans[i]*(n-i)));
		}
		return res;
    }
}