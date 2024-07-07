class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int s=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remBottles= numBottles % numExchange;
            s=s+newBottles;
            numBottles=newBottles+remBottles;
        }
        return s;
    }
}