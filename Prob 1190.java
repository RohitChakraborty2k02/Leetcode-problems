class Solution {
    public String reverseParentheses(String s) {
        int i=0;
        int j=s.length()-1;
        String start="";
        String end="";
        while(i<s.length()&&s.charAt(i)!='(')
        {
           start+=s.charAt(i);
           i++;
        }
         while(j>=0&&s.charAt(j)!=')')
        {
           end=s.charAt(j)+end;
           j--;
        }
        if(i==s.length())
        return s;
        Stack<Character>st=new Stack<>();
        while(i<=j)
        {
            while(i<j && s.charAt(i)!=')')
            {
                st.push(s.charAt(i));
                i++;
            }
            String a="";
            while(!st.isEmpty()&&st.peek()!='(')
            {
                a=a+st.pop();
            }
            st.pop();

            for(char c:a.toCharArray())
            {
                st.push(c);
            }
            i++;
        }
        System.out.println(st);
        String ans="";
        while(!st.isEmpty())
        {
           ans=st.pop()+ans;
        }
        return start+ans+end;
    }
}