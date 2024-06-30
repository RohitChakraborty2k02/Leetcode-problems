class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i=i+3) {
            if(i< nums.length-2 && nums[i] != nums[i+2])
            return nums[i];
        }
        return nums[nums.length-1];
    }
}