class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int c=0;
        int[] arr=new int[len];
        for(int i=0;i<len;i++) {
            if(nums[i]%2==0){ 
                arr[c]=nums[i];
                c+=1;
            }
        }
        for(int i=0;i<len;i++) {
            if(nums[i]%2!=0){ 
                arr[c]=nums[i];
                c+=1;
            }
        }
        return arr;
    }
}