class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=1;i<=n;i++) {
            if (nums[n-i]>=i&&(n-i==0 || nums[n-i-1] < i)) {
                return i;
            }
        }
        return -1;
    }
}