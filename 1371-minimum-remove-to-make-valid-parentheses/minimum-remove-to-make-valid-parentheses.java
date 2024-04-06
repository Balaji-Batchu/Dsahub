class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] aa = s.toCharArray();
        int oc = 0;
        StringBuilder res = new StringBuilder();
        for(char x: aa){
            System.out.println(oc);
            if(String.valueOf(x).equals("(")){
                oc++;
                res.append(String.valueOf(x));
            }
            else if(String.valueOf(x).equals(")") && oc > 0){
                oc--;
                res.append(String.valueOf(x));
            }
            else if((int) x >= 97 && (int) x <=122){
                res.append(String.valueOf(x));
            }
        }
        while(oc > 0){
            res.deleteCharAt(res.lastIndexOf("("));
            oc--;
        }
        return res.toString();
    }
}