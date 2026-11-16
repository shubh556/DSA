class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder ans = new StringBuilder("");
            int i = 0;
            while (i + k <= s.length()) {
                String temp = s.substring(i, i + k);
                ans.append(sum(temp));
                i = i + k;
            }
            if (i < s.length()) {
                ans.append(sum(s.substring(i, s.length())));
            }
            s = ans.toString();
        }
        return s;
    }

    public int sum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(i) - '0';
        }
        return ans;
    }
}