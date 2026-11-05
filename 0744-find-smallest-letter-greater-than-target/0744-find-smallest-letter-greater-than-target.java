class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int diff = Integer.MAX_VALUE;
        for(char ele : letters){
            if(ele > target && ele - ans < diff){
                ans = ele;
                diff = ele - ans;
            }
        }
        return ans;
    }
}