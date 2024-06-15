class Solution {
    public String alphabetBoardPath(String target) {
        int a=0,b=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            int c=(ch-'a')/5;
            int d=(ch-'a')%5;
            while(c < a) {
                a--;
                sb.append('U');
                }
            while(d>b)  {
                b++;
                sb.append('R');}
            while(d<b)   {
                b--;
                sb.append('L');
            }
            while(c>a)   {
                a++;
                sb.append('D');
                }
            sb.append('!');
        }
        return sb.toString();
    }
}