class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = nums[0];
        int maj2 = nums[0];
        int maj1c = 0, maj2c = 0;

        for(int i : nums){
            if(i == maj1){
                maj1c++;
            }
            else if(i == maj2){
                maj2c++;
            }
            else if(maj1c == 0){
                maj1 = i;
                maj1c++;
            }
            else if(maj2c == 0){
                maj2 = i;
                maj2c++;
            }
            else{
                maj1c--;
                maj2c--;
            }
        }

        int c1 = 0, c2 = 0;
        for(int i : nums){
            if(i == maj1){
                c1++;
            }
            else if(i == maj2){
                c2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(c1 > nums.length / 3){
            ans.add(maj1);
        }
        if(c2 > nums.length / 3 && maj1 != maj2){
            ans.add(maj2);
        }
        return ans;
    }
}