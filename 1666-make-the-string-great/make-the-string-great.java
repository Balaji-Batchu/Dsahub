class Solution {
    public String makeGood(String a) {
        StringBuilder s = new StringBuilder(a);
        int start = 0;
        int end = s.length() - 2;
        while (start <= end) {
            System.out.println(s);
            if (Math.abs((int) s.charAt(start) - (int) s.charAt(start + 1)) == 32) {
                System.out.println(
                        "Yes removing " + String.valueOf(s.charAt(start)) +
                                String.valueOf(s.charAt(start + 1)));

                s = s.deleteCharAt(start + 1);
                s = s.deleteCharAt(start);
                start = 0;
                end = s.length() - 2;
            } else {
                start++;
            }
        }
        return s.toString();
    }
}