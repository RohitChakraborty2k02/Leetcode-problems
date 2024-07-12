class Solution {
    public long getDescentPeriods(int[] prices) {
        long curr=1,total=0,prev=prices[0];
        for(long i:prices) {
            if(i-prev==-1) {
                curr++;
                total=total+curr;
            }
            else {
                curr=1;
                total=total+curr;
            }
            prev=i;
        }
        return total;
    }
}