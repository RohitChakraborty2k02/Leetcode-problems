class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int s1=0,s2=0;
        int c=0;
        for(int i=0;i<l;i++) {
            s1=s1+nums1[i];
            s2=s2+nums2[i];
        }
        if(s1==s2) return 0;
        if(s1<s2 || s1>s2) {
            c=(s2-s1)/l;
        }
        return c;
    }
}