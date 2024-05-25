class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       int c= 0;
        if(nums[0]==0){
            c=k;
        }
        for (int i=1; i<nums.length;i++) {
            if (nums[i] == 1) {
                if (c<k) return false;
                c=0;
            }
            else c++;
        }
        return true; 
    }
}