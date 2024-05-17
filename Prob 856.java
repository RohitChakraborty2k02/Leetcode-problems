class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        int bracket = 0;
        for(int i=0; i<s.length(); i++){
        	if(s.charAt(i)=='(')
            	bracket=bracket*2;
        	if(bracket==0)
        		bracket=1;
        	if(s.charAt(i)==')' && s.charAt(i-1)=='(')
        		res = res + bracket;
        	if(s.charAt(i)==')')
        		bracket/=2;
        }
        return res;
    }
}