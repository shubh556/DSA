class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int curr = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(left < right){
                if(curr + nums[left] + nums[right] == 0){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(curr);
                    inner.add(nums[left]);
                    inner.add(nums[right]);
                    ans.add(inner);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(curr + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}