class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while(tickets[k] != 0){
            for(int temp = 0; temp < tickets.length; temp++){
                if(tickets[temp] > 0){
                    if(tickets[k] == 0){
                        break;
                    }
                    else{
                        count += 1;
                        tickets[temp] = tickets[temp] - 1;
                    }
                }
            }
        }
        return count;
    }
}