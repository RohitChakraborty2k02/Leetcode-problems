class Solution {
    public int passThePillow(int n, int time) {
       int d=time/(n-1);
       int r=time%(n-1);
       if(r==0)
       {
        if(d%2==0) return 1;
        else return n;
       } 
       else{
        if(d%2==0) return r+1;
        else return n-r;
       }
    }
}