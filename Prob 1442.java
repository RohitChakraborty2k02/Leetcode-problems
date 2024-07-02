class Solution {
    public int countTriplets(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int a=0;
            for(int j=i;j<arr.length;j++){
                a^=arr[j];
                if(a==0)
                    ans+=(j-i);
            }
        }
        return ans;
    }
}