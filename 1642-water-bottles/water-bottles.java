class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrinked = numBottles;

        //Exchange Logic
        while(numBottles >= numExchange) {
            int rem = numBottles % numExchange;
            int exchanged = numBottles / numExchange;
            totalDrinked += exchanged;
            numBottles = exchanged + rem;
        }

        return totalDrinked;
    }
}