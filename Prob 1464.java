class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int c=0;
        c=(nums[l-1]-1)*(nums[l-2]-1);
        return c;
    }
}