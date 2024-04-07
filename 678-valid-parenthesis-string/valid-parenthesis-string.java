class Solution {
    public boolean checkValidString(String a) {
        int leftmin = 0;
        int leftmax = 0;
        for(Character x : a.toCharArray()){
            if(String.valueOf(x).equals("(")){
                leftmin += 1;
                leftmax += 1;
            }
            else if(String.valueOf(x).equals(")")){
                leftmin -= 1;
                leftmax -= 1;
            }
            else{
                leftmin -= 1;
                leftmax += 1;
            }
            if(leftmax < 0){
                return false;
            }
            if(leftmin < 0){
                leftmin = 0;
            }
        }
        return leftmin == 0 ? true : false;
    }
}