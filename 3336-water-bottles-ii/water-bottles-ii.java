class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrinked = numBottles;
        int emptyBottles = numBottles;

        while(emptyBottles >= numExchange){
            // Exchange logic
            numBottles = 0;
            while(emptyBottles >= numExchange) {
                numBottles += 1;
                emptyBottles -= numExchange;
                numExchange += 1;
            }

            totalDrinked += numBottles;
            emptyBottles += numBottles;
        }

        return totalDrinked;
    }
}