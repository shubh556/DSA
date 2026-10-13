class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int k = 0; k < nums.length; k++){
            if(nums[k] < 0) nums[k] = -nums[k];
        }
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        long score = 0;
        boolean pos = true;
        for(int k = 0; k < nums.length; k++){
            if(pos){
                score += nums[j]*nums[j];
                pos = false;
                j--;
            }
            else {
                score -= nums[i]*nums[i];
                pos = true;
                i++;
            }
        }
        return score;
    }
}