class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> occ = Arrays.stream(nums1)
                                .boxed()
                                .collect(Collectors.toList());
        List<Integer> ans = new ArrayList<>();

        for(int y: nums2){
            if(occ.contains((Integer) y)){
                ans.add(y);
                occ.remove((Integer) y);
            }
        }

        return ans.stream().mapToInt(Integer :: intValue).toArray();
    }
}