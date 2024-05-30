class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
      int ans = 0;
      for(int i=0;i<n;){
        int s=i;
        while(s<n && nums[s]==0)s++;
        int e=s;
        int cn=0;
        int sn=-1,en=-1;
        while(e<n && nums[e]!=0){
            if(nums[e] < 0){
                cn++;
                if(sn==-1)  sn=e;
                en=e;
            }
            e++;
        }
        if(cn % 2 == 0)
            ans = Math.max(ans,e-s);
        else{
            ans = Math.max(ans,en-s);
            ans = Math.max(ans,e-sn-1);
        }    
        i=e+1;
      }  
      return ans;
    }
}