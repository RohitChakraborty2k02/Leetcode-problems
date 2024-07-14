class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int p1=0;
        int p2=0;
        int c=0;
        while(p2<nums.length) {
            if(nums[p2]>nums[p1]) {
                c++;
                p1++;
                p2++;
            }
            if(p2<nums.length && nums[p1]==nums[p2]) p2++;
        }
        return c;
    }
}