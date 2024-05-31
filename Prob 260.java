class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
       ArrayList<Integer>list=new ArrayList<>();
       if(nums[0]!=nums[1]){
        list.add(nums[0]);
       }
       for(int i=1;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
            list.add(nums[i]);
        }
       }
        if(nums[nums.length-1]!=nums[nums.length-2]){
        list.add(nums[nums.length-1]);
       }
       int[] res=new int[list.size()];
       for(int i=0;i<list.size();i++){
        res[i]=list.get(i);
       }
       return res;
    }
}