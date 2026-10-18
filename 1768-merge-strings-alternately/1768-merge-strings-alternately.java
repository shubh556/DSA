class Solution {
    public String mergeAlternately(String a, String b) {
        int i = 0, j = 0;
        boolean first = true;
        StringBuilder ans = new StringBuilder("");
        while (i < a.length() && j < b.length()) {
            if (first) {
                ans.append(a.charAt(i));
                i++;
                first = false;
            }
            else {
                ans.append(b.charAt(j));
                j++;
                first = true;
            }
        }
        while(i < a.length()) ans.append(a.charAt(i++));
        while(j < b.length()) ans.append(b.charAt(j++));

        return ans.toString();
    }
}