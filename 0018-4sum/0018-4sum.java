class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;

            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j-1] == nums[j]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    List<Integer> inner = new ArrayList<>();
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[left]);
                        inner.add(nums[right]);
                        ans.add(inner);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}