class Solution {
    public int countDigits(int num) {
        int i;
        int c=0;
        int r;
        for(i=num;i>0;i=i/10) {
            r=i%10;
            if(num%r==0) c++;
        }
        return c;
    }
}