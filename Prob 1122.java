class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] temp=new int[1001];
        for(int i=0;i<arr1.length;i++)
        {
            temp[arr1[i]]++;  
        }
        int j=0;
        for(int i=0;i<arr2.length;i++) {
            while(j<arr1.length && temp[arr2[i]]!=0) {
                arr1[j++]=arr2[i];
                temp[arr2[i]]--;
            }
        }
        for(int i=0;i<temp.length;i++) {
            while(j<arr1.length && temp[i]!=0) {
                arr1[j++]=i;
                temp[i]--;
            }
        }
        return arr1;
    }
}