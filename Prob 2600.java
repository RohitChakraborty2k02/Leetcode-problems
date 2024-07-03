class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;
        int sum = numOnes + numZeros;
        int sum2 = numOnes + numZeros + numNegOnes;
        if(k > sum && k <= sum2){
            return numOnes - (k - sum);
        }
        return numOnes;
    }
}