class Solution {
    public String longestCommonPrefix(String[] strs) {
        String com = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            while(j < com.length() && j < strs[i].length() && com.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            com = com.substring(0, j);
        }
        return com;
    }
}