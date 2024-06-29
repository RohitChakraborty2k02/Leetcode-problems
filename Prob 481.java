class Solution {
    public int magicalString(int n) {
        if(n <= 3){
            return 1;
        }
        int[] arr = new int[n];
        arr[0] = 1; arr[1] = 2; arr[2] = 2;
        int l = 2, index = 3, ans = 1, num = 1;
        while(index < n){
            for(int i = 0; i < arr[l] && index < n; i++){
                arr[index++] = num;
                if(num == 1){
                    ans++;
                }
            }
            num = (num == 1) ? 2 : 1;
            l++;
        }
        return ans;
    }
}