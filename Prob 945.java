class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int j=i;
            while(j<nums.length-1 && nums[j]>=nums[j+1]){
                nums[j+1]+=1;
                c++;
                j++;
            }
        }
        return c;
    }
}