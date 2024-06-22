class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, res = 0;
        while (r < n) {
            while (r < n && k > 0) if (nums[r++] % 2 != 0) k--;
            int i = l;
            int j = r;
            while (l < r && nums[l] % 2 == 0) l++;
            while (r < n && nums[r] % 2 == 0) r++;
            if (k == 0) res += (l - i + 1) * (r - j + 1);
            l++;
            k++;
        }
        return res;
    }
}