class Solution {
    public int alternateDigitSum(int n) {
        int c=0;
        int r=0;
        int s=0;
        for(int i=n;i>0;i=i/10) {
            c++;
        }
        for(int i=n;i>0;i=i/10) {
            r=i%10;
            if(c%2==0) {
                s=s-r;
            }
            else {
                s=s+r;
            }
            c--;
        }
        return s;
    }
}