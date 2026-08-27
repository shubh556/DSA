class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int ans = max;
        while(min <= max){
            int mid = min + (max - min)/2;
            long hours = 0;
            for(int i : piles){
                int add = (i % mid == 0) ? i/mid : i/mid + 1;
                hours += add;
            }
            if(hours <= h){
                ans = mid;
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return ans;
    }
}