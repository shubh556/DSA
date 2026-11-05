class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int ele : nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        for(int ele : nums){
            if(ele > min && ele < max) count++;
        }
        return count;
    }
}