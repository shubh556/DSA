class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0 && j == 0) {
                    curr.add(1);
                } else if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(prev.get(j) + prev.get(j - 1));
                }
            }
            ans.add(curr);
            prev = curr;
        }
        return ans;
    }
}