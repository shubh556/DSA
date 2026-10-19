class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int less = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target) less++;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans.add(less);
                less++;
            }
        }
        return ans;
    }
}