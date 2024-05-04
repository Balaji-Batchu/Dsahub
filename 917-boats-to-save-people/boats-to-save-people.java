class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        int boats = 0;
        Arrays.sort(people);

        while(l <= r){
            if(people[l] + people[r] <= limit){
                boats += 1;
                l ++;
                r --;
            }
            else {
                boats += 1;
                r --;
            }
        }
        return boats;
    }
}