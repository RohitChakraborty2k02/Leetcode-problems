class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int maxd=0;
            int num=nums[i];
            int cnt=0;
            while(num>0){
                int temp=num%10;
                num=num/10;
                maxd=Math.max(maxd,temp);
                cnt++;
            }
            int no=maxd;
            while(cnt>1){
                no=no*10+maxd;                
                cnt--;
            }
            sum=sum+no;
        }
        return sum;
    }
}