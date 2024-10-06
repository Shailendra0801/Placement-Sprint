class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] str = s.split(" ");
        int left = 0, right = str.length-1;
        while(left < right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        String ans = String.join(" ", str);
        return ans;
    }
}