class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int curr = 1;
        int ans = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] + 1 == nums[i]){
                curr++;
                ans = Math.max(ans, curr);
            }
            else if(nums[i-1] == nums[i]){
                continue;
            }
            else{
                curr = 1;
            }
        }
        return ans;
    }
}