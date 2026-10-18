class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while(i < j){
            if(!isVowel(s.charAt(i))) i++;
            else if(!isVowel(s.charAt(j))) j--;
            else {
                char temp = s.charAt(i);
                str.setCharAt(i, s.charAt(j));
                str.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return str.toString();
    }

    private boolean isVowel(char a){
        a = Character.toLowerCase(a);
        if(a == 'a' ||
        a == 'e' ||
        a == 'i' ||
        a == 'o' ||
        a == 'u') return true;
        else return false;
    }
}