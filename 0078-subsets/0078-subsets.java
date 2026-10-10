class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, 0, curr, ans);
        return ans;
    }

    private void helper(int[] nums, int idx, List<Integer> curr, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        int currInt = nums[idx];
        // include call
        curr.add(currInt);
        helper(nums, idx+1, curr, ans);
        curr.remove(curr.size()-1);

        // exclude call
        helper(nums, idx+1, curr, ans);
    }
}