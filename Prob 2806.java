class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int c=0;
        if(purchaseAmount%10>=5) {
        for(int i=0;i<=9;i++) {
            if((purchaseAmount+i)%10==0) c=purchaseAmount+i;
        }
        }
        if(purchaseAmount%10<5) {
        for(int i=0;i<=9;i++) {
            if((purchaseAmount-i)%10==0) c=purchaseAmount-i;
        }
        }
        return 100-c;
    }
}