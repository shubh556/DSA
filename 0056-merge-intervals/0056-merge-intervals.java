class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 0; i < arr.length; i++){
            int s = arr[i][0];
            int e = arr[i][1];
            if(s <= end){
                end = Math.max(e, end);
            }
            else{
                int[] inner = new int[2];
                inner[0] = start;
                inner[1] = end;
                ans.add(inner);
                start = s;
                end = e;
            }
        }
        int[] inner = new int[2];
        inner[0] = start;
        inner[1] = end;
        ans.add(inner);
        return ans.toArray(new int[ans.size()][]);
    }
}