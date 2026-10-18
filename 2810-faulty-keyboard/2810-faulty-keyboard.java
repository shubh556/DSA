class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i'){
                String curr = reverse(ans, 0, ans.length());
                ans.setLength(0);
                ans.append(curr);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    private String reverse(StringBuilder s, int start, int end){
        char[] arr = s.toString().toCharArray();
        int i = start, j = end-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}