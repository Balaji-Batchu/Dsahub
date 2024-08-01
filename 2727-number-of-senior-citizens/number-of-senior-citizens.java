class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String person: details){
            count = Integer.valueOf(person.substring(11,13)) > 60 ? count + 1 : count;
        }
        return count;
    }
}