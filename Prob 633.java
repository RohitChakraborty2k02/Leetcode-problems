class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        while(c%2==0) c=c/2;
        for(int i=3;i*i<=c;i=i+2) {
            int count=0;
            while(c%i==0) {
                c=c/i;
                count++;
            }
            if(i%4==3 && count%2!=0) return false;
        }
        return c%4!=3;
    }
}